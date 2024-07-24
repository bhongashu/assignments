package q61;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import common.Employee;

public class ImplementArrayList {
	
		public static void main(String[] args){
			
		//create five Employee objects here
		//add those objects in ArrayList
		//display object data from ArrayList using for loop
			
			
			Employee e1=new Employee(1,"sam",1000);
			Employee e2=new Employee(2,"ram",2000);
			Employee e3=new Employee(3,"Sheekha",1000);
			Employee e4=new Employee(4,"Meena",4000);
			Employee e5=new Employee(5,"Rasika",5000);
			
			//List<Employee> al= Arrays.asList(e1,e2,e3,e4,e5);
			
			ArrayList<Employee> al=new ArrayList<>();
			al.add(e1);
			al.add(e2);
			al.add(e3);
			al.add(e4);
			al.add(e5);
			
			// not thread safe
			//not synchronized
			//we can use CopyOnWriteArrayList for synchronization
			
			Iterator<Employee> itr=al.iterator();
			
			while(itr.hasNext()) {
				
				System.out.println(itr.next());
				
			}
		}
		

}
