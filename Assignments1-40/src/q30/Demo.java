package q30;

import common.Employee;

public class Demo {
	
	public static Employee m1(){
		
		//create Employee object here and return
		Employee employee=new Employee(101,"sam",1000);
		//do required changes in m1 method to do this task
		return employee;
	}


	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		
		Employee employee=Demo.m1();
		//display returned employee data here
		System.out.println(employee.getId()+" " +employee.getName()+ " " +employee.getSalary());
	}
}

