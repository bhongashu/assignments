package q72;

import java.util.ArrayList;
import java.util.Comparator;

import q69.Employee;

public class SortEmployeeBySalaryDisc {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(102, "ram", 2000));
		al.add(new Employee(103, "shyam", 3000));
		al.add(new Employee(101, "sam", 10000));
		al.add(new Employee(104, "sameer", 40000));
		
		//sort list in descending order of salary using sort method and Comparator
		
		al.sort(new Comparator<Employee>() {
			
			public int compare(Employee e1,Employee e2) {
				
				if(e2.getSalary()>e1.getSalary()) {
					
					return 1;
				}
				else if(e2.getSalary()<e1.getSalary()) {
					
					return -1;
				}
				
				return 0;
				
				
			}
			
		});
		
		//al.sort((e1,e2)->e1.getId()-e2.getId());
		
		System.out.println(al);
	}

}