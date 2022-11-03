package uk.ac.cf.nsa.web.testserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.ac.cf.nsa.web.testserver.form.ModuleForm;

import java.util.ArrayList;

@SpringBootApplication
public class TestserverApplication {

    public static ArrayList<ModuleForm> modules = new ArrayList<ModuleForm>();

    public static void main(String[] args) {
        SpringApplication.run(TestserverApplication.class, args);
    }


    public static String modulesToString() {
        String modulesString = "";
        for (int i = 0; i < modules.size(); i++) {
            System.out.println(modules.get(i).getModuleCode());
            modulesString = modulesString.concat( modules.get(i).getModuleCode()+" "+
                    modules.get(i).getModuleTitle()+" "+
                    modules.get(i).getCredits()+"; ");
        }
        return modulesString;
    }

}
