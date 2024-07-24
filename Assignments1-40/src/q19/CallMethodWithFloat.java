package q19;

public class CallMethodWithFloat {
	
	public  void m1(float a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		//call m1 method from here
		
		CallMethodWithFloat callMethodWithFloat=new CallMethodWithFloat();
		callMethodWithFloat.m1(10.2f);
	}
}
