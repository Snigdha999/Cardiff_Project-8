package uk.ac.cf.nsa.web.testserver.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.cf.nsa.web.testserver.form.NameAgeForm;
import uk.ac.cf.nsa.web.testserver.form.NameForm;

import java.util.ArrayList;

@RestController
public class FormRestController {

    ArrayList<NameForm> names = new ArrayList<>();

    @RequestMapping (path="/processFormGet")
    public String getFormProcessor(
            @RequestParam(value="firstName", defaultValue="Wendy") String firstNameString,
            @RequestParam(value="surname", defaultValue="Ivins") String surameString){
        return "Data on "+firstNameString+" "+surameString;
    }


    @RequestMapping(path="/processFormPost", method = RequestMethod.POST)
    public String postFormProcessor(NameForm nameForm){
        names.add(nameForm);
        NameForm.printArrayListOfNameForms(names);
        return "Data on "+nameForm.getFirstName()+" "+nameForm.getSurname();
    }

    @RequestMapping(path="/noValidationForm", method = RequestMethod.POST)
    public String noValidationFormProcessor(NameAgeForm nameAgeForm, BindingResult br){
        if (br.hasErrors()) {
            return br.getFieldErrors().toString();
        } else {
            return "Data on " + nameAgeForm.getFirstName() + " " +
                    nameAgeForm.getSurname() + " (" + nameAgeForm.getAge() + ")";
        }
    }



}
