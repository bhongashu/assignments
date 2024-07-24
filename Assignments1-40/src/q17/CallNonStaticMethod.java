package q17;

public class CallNonStaticMethod {
	
	public  void m1(){	
		System.out.println("m1 method");
	}
	
	public static void main(String[] args) {
		//call m1 method from here
		CallNonStaticMethod callNonStaticMethod=new CallNonStaticMethod();
		callNonStaticMethod.m1();
		
	}
}
