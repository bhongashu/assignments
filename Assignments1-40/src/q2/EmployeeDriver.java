package q2;

import common.Employee;

public class EmployeeDriver {
	
		   public static void main(String[] args) {
			//here create object of Employee class and add 101,sam,1000 data into that
			//display that data here
			   
			   Employee employee=new Employee(101, "sam",1000);
			   
			   System.out.println(employee.getId()+" " +employee.getName()+ " " +employee.getSalary());
		   }

}
