package q52;

import common.Employee;

public class EmployeeDriver {
	
	//Create Employee Object and display it’s data using toString that is 
	//only print e and it should display all the data of that object
	public static void main(String[] args) {
		
		Employee employee=new Employee(101,"sam",1000);
		
		System.out.println(employee);
	}


}
