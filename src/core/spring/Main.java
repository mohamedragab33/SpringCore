package core.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		EmployeeModel emp = new EmployeeModel();
		emp.setId(1);
		emp.setName("Mo"); 
		emp.setSalary(1000);
		System.out.println(emp);
		
		System.out.println("----------This from IOC--------------");
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("ConfigureEmployee.xml") ;
		EmployeeModel emp1 = (EmployeeModel) context.getBean("emp1");
		EmployeeModel emp2 = (EmployeeModel) context.getBean("emp2");
		
		System.out.println(emp1);
		System.out.println(emp2);
		

	}

}
