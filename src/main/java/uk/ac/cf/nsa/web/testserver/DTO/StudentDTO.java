package uk.ac.cf.nsa.web.testserver.DTO;

public class StudentDTO {
    private int id;
    private String firstName;
    private String surname;
    private String termLocation;
    private String homeLocation;
    private boolean isPublic;
    private String pin;


    public StudentDTO(int id, String firstName, String surname, String termLocation, String homeLocation, boolean isPublic, String pin) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.termLocation = termLocation;
        this.homeLocation = homeLocation;
        this.isPublic = isPublic;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getTermLocation() {
        return termLocation;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public String getPin() {
        return pin;
    }
}
