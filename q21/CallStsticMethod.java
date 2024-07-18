package q21;

import common.Employee;

public class CallStsticMethod {
	
	public static void m1(Employee e){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		
		Employee employee=new Employee();
		CallStsticMethod.m1(employee);
	}
}
