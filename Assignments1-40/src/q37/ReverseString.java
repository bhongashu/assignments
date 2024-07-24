package q37;

public class ReverseString {
	
	public static String reverseString(String str){
		//reverse str string here and return
		String[] stringArray=str.split(" ");
		String str2="";
		for(int i=stringArray.length-1; i>=0; i--) {
			
			String str1=stringArray[i];
			str2=str2+" "+str1;
		}
		return str2;
	}
	public static void main(String[] args) {
		String str = "Hello Welcome";
		String reversedString = reverseString(str);
		System.out.println(reversedString);
	}
}
