package q16;

public class CallStaticMethodDemo {
	public static void m1(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		//call m1 method from here
		int a=10;
		CallStaticMethodDemo.m1(a);
	}
}

