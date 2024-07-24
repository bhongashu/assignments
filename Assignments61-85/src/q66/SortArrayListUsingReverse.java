package q66;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListUsingReverse {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(7);
		al.add(9);
		//sort  list in descending order (use reverse function)
		
		Collections.reverseOrder(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				if(o2>o1) {
					return 1;
				}
				else if(o2<o1) {
					
					return -1;
				}
				return 0;
			
			}
			
		});
		System.out.println(al);
	}

}
