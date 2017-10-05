package prolemsOne_Ten;

public class ReverseString {

	public static void main(String[] args) {
		String myStr = "Konkobility";
		
		
		for (int i = myStr.length()-1; i>=0; i--) {
		String newStr = Character.toString(myStr.charAt(i));	
		System.out.print(newStr);
		}
		
	}

}
