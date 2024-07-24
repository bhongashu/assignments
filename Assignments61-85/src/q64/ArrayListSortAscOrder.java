package q64;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortAscOrder {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(7);
		al.add(9);
		//sort  list in ascending order
		
		Collections.sort(al);
		System.out.println(al);
	}
}
