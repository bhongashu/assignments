package q9;

import common.Employee;

public class Demo {
	
		public static void main(String[] args) {
			//create Employee object with 101,sam,1000 data
			//display this object data by passing to show method
			//add 100 bonus in salary 
			//display this object data by passing to show method
			
			Employee employee=new Employee(101,"sam",1000);
			int bonus=100;
			Demo.show(employee);
			employee.setSalary(1000+bonus);
			Demo.show(employee);
			
		}
		public static void show(Employee ex){
			//do required changes in show method
			System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSalary());
		}
	

}
