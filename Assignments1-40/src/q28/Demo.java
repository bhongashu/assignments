package q28;

public class Demo {
	
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		int returnedValue=Demo.m1(10);
		
		//int total = 100 + use returned value here;
		
		int total=100+returnedValue;
		
		System.out.println(total);
	}
}
