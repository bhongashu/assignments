package q57;

import common.Employee;

public class CompareTwoEmployeeObjects {
	
	///Create two employee objects and compare it’s references using == and equals
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"sam",1000);
		Employee e2=new Employee(2,"ram",2000);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
	}
	
	

}
