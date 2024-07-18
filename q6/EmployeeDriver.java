package q6;

import common.Employee;

public class EmployeeDriver {
	
	  public static void main(String[] args) {
          //here create object of Employee class and add 101,sam,1000 data into that
    //call show method and pass this created object to show method
		  
		  Employee employee=new Employee();
		  EmployeeDriver employeeDriver=new EmployeeDriver();
		  
		  employee.setId(101);
		  employee.setName("sam");
		  employee.setSalary(1000);
		  
		  employeeDriver.show(employee);
	
	  }
	  public void show(Employee employee){
		  	
		  System.out.println(employee.getId()+" " +employee.getName()+ " " +employee.getSalary());
	  }


}
