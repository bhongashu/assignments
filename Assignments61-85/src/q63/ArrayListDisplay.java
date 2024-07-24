package q63;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import common.Employee;

public class ArrayListDisplay {

	public static void main(String[] args) {

		// create five Employee objects here
		// add those objects in ArrayList
		// pass this ArrayList to display function

		Employee e1 = new Employee(1, "sam", 1000);
		Employee e2 = new Employee(2, "ram", 2000);
		Employee e3 = new Employee(3, "Sheekha", 1000);
		Employee e4 = new Employee(4, "Meena", 4000);
		Employee e5 = new Employee(5, "Rasika", 5000);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		ArrayListDisplay.display(empList);

	}

	public static void display(List<Employee> empList) {
		// do required changes to display method
		// display ArrayList data here
		
		Iterator<Employee> itr= empList.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
