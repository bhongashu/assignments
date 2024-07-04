package q24;

import common.Employee;

public class CallStaticMethodWithEmployee {
	
	public static void m1(Employee e){
		//display data here
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
	}
	public static void main(String[] args) {
		//call m1 method from here
		Employee employee =new Employee(1, "Sam" ,2000);
		
		CallStaticMethodWithEmployee.m1(employee);
	}
}
