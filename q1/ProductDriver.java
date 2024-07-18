package q1;

public class ProductDriver {

	public static void main(String[] args) {
		
		
		Product product=new Product(1,"iphone15",1000.1f);
		
		System.out.println(product.getId()+" " +product.getName()+ " " +product.getPrice());

	}

}
