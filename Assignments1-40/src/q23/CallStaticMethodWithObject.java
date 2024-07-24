package q23;

public class CallStaticMethodWithObject {
	
	public static void m1(Object o){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		Object obj=new Object();
		
		CallStaticMethodWithObject.m1(obj);
	}
}
