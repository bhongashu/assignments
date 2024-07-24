package q38;


public class ReverseCharacters {
	
	private static String reverseChar(String input) {
		
		String output="";
		char[] charArray=input.toCharArray();
		
		for(int i=charArray.length-1; i>=0;i--) {
			
			char c=charArray[i];
			output=output+c;
		}
		 
		return output;
	}
	
	public static void main(String[] args) {
		String str = "Hello Welcome";
		String output=ReverseCharacters.reverseChar(str);
		//here print second character of str string for example e
		System.out.println(output);
		System.out.println(str.charAt(1));
		
	}
}
