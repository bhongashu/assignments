	package q67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListInDisc {
		public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(10);
			al.add(5);
			al.add(7);
			al.add(9);
			//sort  list in descending order using comparator
			
			Collections.sort(al,new Comparator<Integer>() {

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
