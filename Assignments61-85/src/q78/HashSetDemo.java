package q78;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// Create HashSet of Integers and display data
		
		Set<Integer> set=new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		
		Iterator<Integer> itr=set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
