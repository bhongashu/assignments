package q12;

public class StaticVariableCallDemo {
	
	private static int total = 10;
	public static void main(String[] args) {
		//print total in different ways
		StaticVariableCallDemo demo=new StaticVariableCallDemo();
		
		
		System.out.println(total);
		System.out.println(StaticVariableCallDemo.total);
		System.out.println(demo.total);
		
	}


}
