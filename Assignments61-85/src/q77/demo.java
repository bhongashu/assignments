package q77;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import q69.Employee;

public class demo {
	

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "sam", 10000));
		al.add(new Employee(102, "sameer", 2000));
		al.add(new Employee(103, "shyam", 30000));
		al.add(new Employee(104, "ram", 4000));
		al.add(new Employee(105, "ramesh", 15000));
		al.add(new Employee(106, "sameera", 60000));
		
		//create another arrayList which contains Employees whose salary is more than 5000
                   //display new list
		
//		List<Employee> empList=al.stream().filter(s->s.getSalary()>5000).collect(Collectors.toList());
//		
//		System.out.println(empList);
		List<Employee> empList=new ArrayList<>();
		
		for(Employee e: al) {
			
			if(e.getSalary()>5000) {
				empList.add(e);
				
			}

		}
		System.out.println(empList);
	}
}