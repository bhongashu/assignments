package q5;

import common.Employee;

public class EmployeeDriver {
	
	  public static void main(String[] args) {
          //here create object of Employee class and add 101,sam,1000 data into that
	        //call show method and pass this created object to show method
		  
		  Employee employee=new Employee();
		  
		  employee.setId(101);
		  employee.setName("sam");
		  employee.setSalary(1000);
		  
		  EmployeeDriver.show(employee);

	}
	public static void show(Employee employee){
		//do required changes to show method and display that data here
		
		 System.out.println(employee.getId()+" " +employee.getName()+ " " +employee.getSalary());
	}

}
