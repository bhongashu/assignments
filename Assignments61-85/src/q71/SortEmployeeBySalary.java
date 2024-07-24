package q71;

import java.util.ArrayList;
import java.util.Collections;

import q69.Employee;

public class SortEmployeeBySalary {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(102, "ram", 2000));
		al.add(new Employee(103, "shyam", 3000));
		al.add(new Employee(101, "sam", 10000));
		al.add(new Employee(104, "sameer", 40000));
		//sort list in ascending order of salary using sort method and Comparator
		MyComparator mycompare=new MyComparator();
		
		Collections.sort(al,mycompare);
		
		System.out.println(al);
	}
}
