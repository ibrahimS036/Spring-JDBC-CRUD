package in.beans;

public class Employee {

	private int empid;
	private String empname;
	private String compney;
	private String empcity;

	//Setters and getters
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getCompney() {
		return compney;
	}

	public void setCompney(String compney) {
		this.compney = compney;
	}

	public String getEmpcity() {
		return empcity;
	}

	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", compney=" + compney + ", empcity=" + empcity
				+ "]";
	}

}
