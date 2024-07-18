package q11;

public class StaticMethodCallDemo {
	
		public static void main(String[] args) {
			//call show method in different ways
			StaticMethodCallDemo demo=new StaticMethodCallDemo();
			demo.show();
			StaticMethodCallDemo.show();
			show();
		}
		public static void show(){
			System.out.println("show method");
		}

}
