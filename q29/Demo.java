package q29;

public class Demo {
	
	public static float m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		float returnedValue=Demo.m1(2);
		
		//int total = 100 + use returned value here;
		int total= (int)(100+returnedValue);
		System.out.println(total);
	}
}

