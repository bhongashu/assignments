package q35;

//find the output
public class Demo {
	static int total = 0;

	public static void add() {  
		int total = 10 + 30;
	}

	public static void main(String[] args) {
		Demo.add();
		System.out.println(total); //0
	}
}
