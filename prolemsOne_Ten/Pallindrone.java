package prolemsOne_Ten;

public class Pallindrone {

	public static void main(String[] args) {
			
		String myStr = "maxam";
		if(isPallindrome(myStr)) System.out.println("Pallin");
		else System.out.println("Not Pallin");

	}
	
	public static boolean isPallindrome(String str){
		int N = str.length();
		for (int i = 0; i<N/2; i++) 
			if(str.charAt(i) != str.charAt(N-1-i))
				return false;
				return true;
			}
}