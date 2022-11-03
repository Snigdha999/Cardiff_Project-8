package uk.ac.cf.nsa.web.testserver.model;

import uk.ac.cf.nsa.web.testserver.DTO.StudentDTO;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper {


    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new StudentDTO(rs.getInt("ID"),
                rs.getString("firstName"),
                rs.getString("surname"),
                rs.getString("termLocation"),
                rs.getString("homeLocation"),
                rs.getBoolean("public"),
                "xxxx");
    }


    @Override
    public int[] getRowsForPaths(TreePath[] path) {
        return new int[0];
    }
}
