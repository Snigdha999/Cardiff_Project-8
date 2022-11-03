package uk.ac.cf.nsa.web.testserver.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EX1_Controller {
    String[] tips = {
            "Always close your HTML tags",
            "Style HTML using style sheets wherever possible",
            "Use an HTML validator",
            "Use HTML comments wisely",
            "When embedding images in HTML, do not use absolute URLs! ",
            "Non-breaking spaces in HTML (&amp;nbsp;) allow words to be kept together",
            "Use tables for tabular data, CSS for layout",
            "Create empty table cells with non breaking spaces (&amp;nbsp;)"
    };
    String[] cssTips = {
            "Text is centered using the text-align:center;",
            "Use the direct children selector to select child elements (e.g. #footer > a)"
    };
    String reference ="https://www.elated.com/articles/10-html-tips-for-beginners/";

    @RequestMapping(path = "/giveMeATip")
    public String tip() {
        int rnd = (int)(Math.random()*8);
        return tips[rnd]+".<br>"+reference ;
    }

    //    route http://localhost:8080/giveMeAPersonalisedTip?name=Ian
    @RequestMapping(path = "/giveMeAPersonalisedTip")
    public String personalisedTip(@RequestParam(value="name",defaultValue="User") String name ){
        int rnd = (int)(Math.random()*8);
        return "Hi "+name+", here is your tip:<br> "+tips[rnd]+".<br>"+reference ;
    }

    //    route http://localhost:8080/giveMeAPersonalisedTip/CSS?name=Ian
    @RequestMapping(path = "/giveMeAPersonalisedTip/{topic}")
    public String topicTip(@PathVariable Optional<String> topic,
                           @RequestParam(value="name",defaultValue="User") String name) {
        String topicString = "HTML";
        if(topic.isPresent()) {
            topicString = topic.get();
        }
        String tip;
        switch(topicString){
            case "CSS":
                int rnd = (int)(Math.random()*cssTips.length);
                tip = cssTips[rnd];
                break;
            default:
                rnd = (int)(Math.random()*tips.length);
                tip = tips[rnd];
                break;
        }
        return "Hi "+name+", here is your tip:<br> "+tip+".<br>"+reference ;
    }
}
