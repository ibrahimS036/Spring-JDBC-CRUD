package in.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.beans.Employee;

public class RowMapperImp implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpid(rs.getInt(1));
		emp.setEmpname(rs.getString(2));
		emp.setCompney(rs.getString(3));
		emp.setEmpcity(rs.getString(4));

		return emp;
	}

}
