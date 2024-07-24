package q53;

public class Product {
	
	//Create product class with id,name,price,qnty and create object with some data and display that data using toString
	
	private int id;
	private String name;
	private float price;
	private double quantity;
	
	Product(){
		
	}
	
	public Product(int id,String name,float price,double quantity){
		
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	
	public String toString() {
		
		return "["+this.id+""+this.name+""+this.price+"" +this.quantity+"]";
	}
}
