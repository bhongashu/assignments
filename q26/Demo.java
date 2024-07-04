package q26;

import common.Employee;

public class Demo {
	public static void m1(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		//call m1 method and pass employee id as parameter
		
		Employee employee=new Employee(101,"sam",1000);
		Demo.m1(employee.getId());
		
		
	}
}
