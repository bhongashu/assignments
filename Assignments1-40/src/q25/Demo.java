package q25;

import common.Employee;

public class Demo {
	public static void m1(Object o){
		//display employee data here
		Employee e=(Employee)o;
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		//call m1 method by passing this Employee object
		
		Employee employee=new Employee(101,"sam",1000);
		Demo.m1(employee);
		
	}
}
