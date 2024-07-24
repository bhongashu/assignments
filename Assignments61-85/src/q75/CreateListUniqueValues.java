package q75;

import java.util.ArrayList;

public class CreateListUniqueValues {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(5);
		al.add(16);
		al.add(7);
		al.add(16);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		al1.add(7);
		al1.add(5);
		al1.add(56);
		al1.add(17);
		al1.add(26);
		//create a third arrayList al2 which should be a combination of both al and al1. 
		//al2 should contain unique value.
		
		ArrayList<Integer> al2=new ArrayList<>();
		
		for(int i=0; i<al.size();i++ ) {
			
			if(!al2.contains(al.get(i))) {
				al2.add(al.get(i));
			}
		}
		
		for(int j=0; j<al1.size();j++) {
			
			if(!al2.contains(al1.get(j))) {
				al2.add(al1.get(j));
			}
		}
		
		System.out.println(al2);
	}
}
