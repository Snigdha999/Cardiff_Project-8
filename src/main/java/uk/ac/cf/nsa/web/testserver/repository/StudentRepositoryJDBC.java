package uk.ac.cf.nsa.web.testserver.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import uk.ac.cf.nsa.web.testserver.DTO.StudentDTO;
import uk.ac.cf.nsa.web.testserver.model.StudentCountMapper;
import uk.ac.cf.nsa.web.testserver.model.StudentMapper;

public class StudentRepositoryJDBC implements StudentRepository{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepositoryJDBC(JdbcTemplate aTemplate) {
        jdbcTemplate = aTemplate;
    }

    @Override
    public Object findStudentBySurname(String surname) {
        StudentDTO studentDTO = (StudentDTO) jdbcTemplate.queryForObject(
                "select ID,firstName,surname,termLocation,homeLocation,public from Students where surname=? and public='true'" ,
                new Object[]{surname}, new StudentMapper());
        return studentDTO;
    }
    @Override
    public StudentDTO findStudentById(String id) {
        StudentDTO studentDTO = (StudentDTO) jdbcTemplate.queryForObject(
                "select ID,firstName,surname,termLocation,homeLocation,public from Students where id=? and public='true'" ,
                new Object[]{id}, new StudentMapper());
        return studentDTO;
    }

    @Override
    public Object numStudents() {

        return jdbcTemplate.query(
                "select count(*) from Students" ,
                new StudentCountMapper());
    }

}
