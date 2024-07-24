package q73;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(5);
		al.add(16);
		al.add(7);
		al.add(16);
        //remove duplicates from list and display (insertion order should not change)
		
		Set<Integer> set=new LinkedHashSet<>(al);
		
		System.out.println(set);
		
		
		
		
	}
}
