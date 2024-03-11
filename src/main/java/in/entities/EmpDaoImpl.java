package in.entities;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import in.beans.Employee;

public class EmpDaoImpl implements EmpDao {

	JdbcTemplate jdbctemp;

	// Creating Employee
	public int create(Employee ref) {
		String query = "insert into employeedata(empid,empname,compney,empcity) values(?,?,?,?)";
		int result = jdbctemp.update(query, ref.getEmpid(), ref.getEmpname(), ref.getCompney(), ref.getEmpcity());
		return result;
	}

	// Reading Employee
	public Employee read(int id) {
		String query = "select * from employeedata where empid=?";
		RowMapper<Employee> rm = new RowMapperImp();
		Employee employee = jdbctemp.queryForObject(query, rm, id);
		return employee;
	}

	// Updating Employee
	public int update(Employee emp) {
		String query = "update employeedata set empname=?, compney=?, empcity=? where empid=? ";
		int result = jdbctemp.update(query, emp.getEmpname(), emp.getCompney(), emp.getEmpcity(), emp.getEmpid());
		return result;
	}

	public int delete(int id) {
		String query = "delete from employeedata where empid=?";
		int result = jdbctemp.update(query, id);
		return result;
	}

	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

}
