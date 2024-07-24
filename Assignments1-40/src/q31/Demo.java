package q31;

import common.Employee;

public class Demo {
	

	public static Object m1(){
		//create Employee object here and return
		Employee employee=new Employee(101,"sam",1000);
		//don’t change m1 method prototype i.e return type or access specifier
		return employee;
	}
	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		
		Employee employee=(Employee)Demo.m1();
		//display returned employee data here
		System.out.println(employee.getId()+" " +employee.getName()+ " " +employee.getSalary());
	}

}