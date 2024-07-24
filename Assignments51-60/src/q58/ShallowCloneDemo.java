package q58;

public class ShallowCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// Create an employee object with some data and create a clone of it and display data from the cloned object.

		Employee e1=new Employee(1,"sam",1000);
		//Employee e2=new Employee(2,"ram",2000);
		
		Employee e3=(Employee) e1.clone();
		
		System.out.println(e3);
		
		e1.setId(2);
		
		System.out.println(e3);
		System.out.println(e1);
		
	}

}
