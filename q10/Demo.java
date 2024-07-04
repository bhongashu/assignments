package q10;

import common.Employee;

public class Demo {
	
		public static void main(String[] args) {
			//create Employee object with 101,sam,1000 data
			//display this object data by passing to show method
			//add 100 bonus in salary 
			//display this object data by passing to show method
			
			Demo demo=new Demo();
			Employee employee=new Employee(101,"sam",1000);
			int bonus=100;
			demo.show(employee);
			employee.setSalary(1000+bonus);
			demo.show(employee);
			
		}
		public void show(Employee employee){
			//do required changes in show method
			
			System.out.println(employee.getId()+" " +employee.getName()+ " " +employee.getSalary());
		}


}
