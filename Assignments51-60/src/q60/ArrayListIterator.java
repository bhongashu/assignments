package q60;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import common.Employee;

public class ArrayListIterator {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"sam",1000);
		Employee e2=new Employee(2,"ram",2000);
		
		List<Employee> empList=new ArrayList<>();
		
		empList.add(e1);
		empList.add(e2);
		
		Iterator<Employee> itr=empList.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
