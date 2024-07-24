package q76;

import java.util.ArrayList;

import q69.Employee;

public class CreateListWithIds {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "sam", 1000));
		al.add(new Employee(102, "sameer", 2000));
		al.add(new Employee(103, "shyam", 3000));
		al.add(new Employee(104, "ram", 4000));
		al.add(new Employee(105, "ramesh", 5000));
		al.add(new Employee(106, "sameera", 60000));
		//create another arrayList which contains only id of these Employees.
		
		ArrayList<Integer> alId=new ArrayList<>();
		
		for(int i=0; i<al.size(); i++) {
			
			Employee e=al.get(i);
			alId.add(e.getId());
		}
		
		System.out.println(alId);
	}
}
