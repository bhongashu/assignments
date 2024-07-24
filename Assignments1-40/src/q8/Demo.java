package q8;

import common.Employee;

public class Demo {
	
	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		Demo.show(emp);
		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSalary());
	}

	public static void show(Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSalary());
		ex.setId(102);
	}

}
