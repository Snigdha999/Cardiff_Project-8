package uk.ac.cf.nsa.web.testserver.form;

import java.util.ArrayList;

public class NameForm {
    String firstName;
    String surname;

    public NameForm(String firstName, String surname){
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public static void printArrayListOfNameForms(ArrayList<NameForm> names){
        for (NameForm n:names){
            System.out.println(n.getFirstName()+", "+n.getSurname());
        }
    }



}
