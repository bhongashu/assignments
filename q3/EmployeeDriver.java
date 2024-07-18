package q3;

import common.Employee;

public class EmployeeDriver {
	

		   public static void main(String[] args) {
			//here create object of Employee class and add 101,sam,1000 data into that using setter method
			//display that data here
			   
			   Employee employee=new Employee();
			   
			   employee.setId(101);
			   employee.setName("sam");
			   employee.setSalary(1000);
			   
			   System.out.println(employee.getId()+" " +employee.getName()+ " " +employee.getSalary());
		   }
		

}
