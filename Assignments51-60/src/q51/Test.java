package q51;

public class Test implements Simcard{
	
	public void sms() {
		
		System.out.println("sms method");
	}

	@Override
	public void call() {
		
		System.out.println("call method");
	}

}
