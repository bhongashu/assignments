package q13;

public class Demo {
	
	int x = 10;
	public void show(){
		int x = 100;
		Demo d=new Demo();
		System.out.println(x);//do required changes at this line but output should be 100
		System.out.println(d.x);//do required changes at this line but output should be 10
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();
		}

}
