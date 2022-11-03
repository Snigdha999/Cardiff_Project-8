package uk.ac.cf.nsa.web.testserver.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
public class GreetingRestController {
    @RequestMapping (path = "/greeting")
    public String myGreeting(){
        return "Greetings";
    }

    @RequestMapping (path = "/greetingDate")
    public String myGreetingDate(){
        String date = new Date().toString();
        return "Greetings on " +date;
    }
    @RequestMapping (path = {"/greetingNameURL","/greetingNameURL/{name}"})
    public String myGreetingNameURL(@PathVariable Optional<String> name){
        String nameString = "World";   // default name
        if (name.isPresent()){
            nameString = name.get();
        }
        return "Greetings "+nameString;
    }

    @RequestMapping (path = {"/greetingNameGet"})
    public String myGreetingNameGet(
            @RequestParam(value="name", defaultValue="World")
            String nameString){
        return "Greetings "+nameString;
    }


}
