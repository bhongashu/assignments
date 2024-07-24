package q51;


public class MainClass{
	
	public static void main(String[] args) {
		
		Test test=new Test();
		test.sms();
		test.call();
		
		Simcard simcard=new Test();
		simcard.call();
		simcard.sms();
	}
}

