package q33;

import common.Employee;

public class Demo {
	
	public static void show(Employee employee){
		
		System.out.println(employee.getId()+" " +employee.getName()+ " " +employee.getSalary());
		
	}
	
	public static Employee process(Employee employee){
		
		employee.setId(101);
		employee.setName("sam");
		employee.setSalary(1000);
		
		return employee;
	}
	public static void main(String[] args) {
		//do required changes in main,process and show method
		//create empty employee object here
		Employee employee=new Employee();
		//add data into that empty object using process method
		Employee processedEmployee=Demo.process(employee);
		
		//display employee object with data in show method
		Demo.show(processedEmployee);
	}
}

