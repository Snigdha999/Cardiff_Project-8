package uk.ac.cf.nsa.web.testserver.model;

import org.springframework.jdbc.core.RowMapper;
import uk.ac.cf.nsa.web.testserver.DTO.StudentCountDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentCountMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new StudentCountDTO(rs.getInt("count(*)"));
    }

}
