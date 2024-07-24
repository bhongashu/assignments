package q59;

public class FinalizeDemo {
	
	//Write a program which will explain finalize method
	
	public static void main(String[] args) {
		
		FinalizeDemo e1=new FinalizeDemo();
		e1=null;
		
		System.gc();
	}
	
	@Override
	public void finalize() {
		
		System.out.println("finalise method called");
	}

}
