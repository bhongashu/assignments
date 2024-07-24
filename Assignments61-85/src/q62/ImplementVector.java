package q62;

import java.util.Enumeration;
import java.util.Vector;

import common.Employee;

public class ImplementVector {

	public static void main(String[] args) {

		//create five Employee objects here
		//add those objects in Vector
		//display object data from Vector using Enumeration
		
		Employee e1=new Employee(1,"sam",1000);
		Employee e2=new Employee(2,"ram",2000);
		Employee e3=new Employee(3,"Sheekha",1000);
		Employee e4=new Employee(4,"Meena",4000);
		Employee e5=new Employee(5,"Rasika",5000);
		
		Vector<Employee> vector=new Vector<>();
		
		//thread safe
		//synchronized
		//otherwise same as arrayList
		
		vector.add(e1);
		vector.add(e2);
		vector.add(e3);
		vector.add(e4);
		vector.add(e5);
		
		Enumeration<Employee> e=vector.elements();
		
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}

	}

}
