package q79;

import java.util.HashSet;
import java.util.Set;

public class HashSetEmployee {
	
	public static void main(String[] args) {
		
		Set<Employee> set=new HashSet<>();
		
        Employee e1 = new Employee(1, "John", 50000);
        Employee e2 = new Employee(1, "Jane", 60000);
        Employee e3 = new Employee(2, "Jack", 70000);
        
        set.add(e1); set.add(e2); set.add(e3);
		
		System.out.println(set);
		System.out.println(e1.hashcode());
		System.out.println(e2.hashcode());
		System.out.println(e3.hashcode());
	}

}
