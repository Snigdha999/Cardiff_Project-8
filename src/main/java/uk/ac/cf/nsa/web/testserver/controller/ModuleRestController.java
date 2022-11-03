package uk.ac.cf.nsa.web.testserver.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.cf.nsa.web.testserver.TestserverApplication;
import uk.ac.cf.nsa.web.testserver.form.ModuleForm;


@RestController
public class ModuleRestController {

    @RequestMapping(path = "/addModule", method = RequestMethod.POST)
    public String logModule(ModuleForm moduleForm, BindingResult br) {
        if (br.hasErrors()) {
            System.out.println(br.getFieldErrors());
            return "there are errors in your form data";
        }
        System.out.println("addingModule "+ moduleForm.getModuleTitle());
        TestserverApplication.modules.add(moduleForm);
        return TestserverApplication.modulesToString();
    }

    @RequestMapping(path = "/api/modules")
    public String returnModules( ){
        String modules =  TestserverApplication.modulesToString();
        System.out.println(modules);
        return modules;
    }

}


