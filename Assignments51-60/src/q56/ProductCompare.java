package q56;

import q53.Product;

public class ProductCompare {

	public static void main(String[] args) {
		
		//Create two product class objects and compare its data
		
		Product p1=new Product(1,"iphone14",1000,10);
		Product p2=new Product(2,"iphone15",1500.3f,10);
		
		System.out.println(p1.getId()==p2.getId());
		
		System.out.println(p1.getQuantity()==p2.getQuantity());
		
		

	}

}
