package q22;

public class CallStaticMethodWithString {
	
	public static void m1(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		//call m1 method from here
		
		CallStaticMethodWithString.m1("hello");
	}
}
