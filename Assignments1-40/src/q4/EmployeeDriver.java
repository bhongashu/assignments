package q4;

import common.Employee;

public class EmployeeDriver {
	
	   public static void main(String[] args) {
			//here create object of Employee class and add 101,sam,1000 data into that using constructor
			//display that data here
		   
		   Employee employee=new Employee(101, "sam" ,1000);
		   
		   System.out.println(employee.getId()+" " +employee.getName()+ " " +employee.getSalary());
		   
		   
	   }

}
