package uk.ac.cf.nsa.web.testserver.repository;

public interface StudentRepository {
    public Object findStudentBySurname(String surname);
    public Object findStudentById(String surname);
    public Object numStudents();
}
