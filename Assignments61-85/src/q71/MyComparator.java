package q71;

import java.util.Comparator;

import q69.Employee;

public class MyComparator implements Comparator<Employee>{
	
	public int compare(Employee e1,Employee e2) {
		
		if(e1.getSalary()>e2.getSalary()) {
			
			return 1;
		}
		else if(e1.getSalary()<e1.getSalary()) {
			
			return -1;
		}
		
		return 0;
	}

}
