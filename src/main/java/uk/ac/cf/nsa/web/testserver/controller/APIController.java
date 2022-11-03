package uk.ac.cf.nsa.web.testserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.cf.nsa.web.testserver.DTO.StudentCountDTO;
import uk.ac.cf.nsa.web.testserver.repository.StudentRepository;

import java.util.List;

@RestController
public class APIController {

    @Autowired
    private StudentRepository studentRepo;

    @RequestMapping(path="/NumberStudents")
    public String numberStudents(){
        List number = (List)studentRepo.numStudents();
        StudentCountDTO dto = (StudentCountDTO)number.get(0);
        return String.valueOf(dto.getCount());
    }


}
