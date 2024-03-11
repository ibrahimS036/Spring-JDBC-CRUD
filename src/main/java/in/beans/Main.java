package in.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.entities.EmpDao;
import in.entities.EmpDaoImpl;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello Spring JDBC CRUD...");
		Scanner sc = new Scanner(System.in);
		String fileLocation = "/in/entities/configuration.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(fileLocation);
		EmpDao dao = context.getBean("EDaoImpl", EmpDaoImpl.class);

		// Create
		Employee emp = new Employee();
		emp.setEmpid(4);
		emp.setEmpname("Irfan Khan");
		emp.setCompney("Wipro");
		emp.setEmpcity("Chennei");
		dao.create(emp);
		System.out.println("Employee Added Successfully.");

		// Read
		System.out.println("Enter ID to find employee.");
		int id = sc.nextInt();
		Employee result = dao.read(id);
		System.out.println(result);

		// Update
		Employee emp3 = new Employee();
		emp3.setEmpid(2);
		emp3.setEmpname("Rahul");
		emp3.setCompney("TCS");
		emp3.setEmpcity("Gulberga");
		int result2 = dao.update(emp3);
		System.out.println(result2 + "Employee Update Successfully.");

		// Delete
		System.out.println("Enter id to delete emoloyee");
		int deleteid = sc.nextInt();
		int delete = dao.delete(id);
		System.out.println(delete + "Employee Deleted successfully.");

	}

}
