package uk.ac.cf.nsa.web.testserver.form;

import java.util.ArrayList;

public class NameAgeForm {

    String firstName;
    String surname;
    int age;

    public NameAgeForm(String firstName, String surname, int age){
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }
}
