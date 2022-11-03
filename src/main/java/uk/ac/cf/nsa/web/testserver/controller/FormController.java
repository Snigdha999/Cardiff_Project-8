package uk.ac.cf.nsa.web.testserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import uk.ac.cf.nsa.web.testserver.form.NameForm;

import java.util.ArrayList;

@Controller
public class FormController {

    ArrayList<NameForm> names = new ArrayList<>();

//    @RequestMapping(path="/processFormPostHTMLReturn", method = RequestMethod.POST)
//    public String postFormProcessor(NameForm nameForm){
//        names.add(nameForm);
//        NameForm.printArrayListOfNameForms(names);
//        return "redirect:HelloWorld.html";
//    }

    @RequestMapping(path="/processFormPostHTMLReturn", method = RequestMethod.POST)
    public ModelAndView postFormProcessor(NameForm nameForm){
        names.add(nameForm);
        NameForm.printArrayListOfNameForms(names);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", nameForm);
        modelAndView.addObject("names", names);
        modelAndView.setViewName("HelloName");
        return modelAndView;
    }

    @RequestMapping (path="/Layout")
    public ModelAndView layout(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Layout");
        return mav;
    }


}
