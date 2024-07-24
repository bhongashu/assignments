package q58;

public class DeepCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a1=new Address("Montreal","Canada");
		
		Employee1 e1=new Employee1(1,"Ashwini",a1);
		
		
		
		Employee1 e2=(Employee1) e1.clone();
		
		e1.setAddress(new Address("Pune","India"));
		
		System.out.println(e2);
		
		System.out.println(e1);
		
		
		
		
		

	}

}
