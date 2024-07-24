package q1;

public class Product {
	
	//1.Create Product class with fields id,name and price and 
	//create Product object and store data and display that data.
	
	private int id;
	private String name;
	private float price;
	
	Product(){
		
	}
	
	Product( int id, String name,float price){
		
		this.id=id;
		this.name=name;
		this.price=price;
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
	

}
