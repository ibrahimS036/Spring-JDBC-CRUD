package in.entities;

import in.beans.Employee;

public interface EmpDao {

	public int create(Employee ref);

	public Employee read(int id);

	public int update(Employee emp);

	public int delete(int id);

}
