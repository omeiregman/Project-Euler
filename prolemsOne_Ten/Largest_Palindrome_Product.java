package prolemsOne_Ten;

/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * */

public class Largest_Palindrome_Product {

	public static void main(String[] args) {

		int startNum = 900;
		int endNum = 999;
		int num;
		String Pallindrome = "";
		
		for (int i = startNum; i<=endNum; i++){
			for (int j = startNum; j<=endNum; j++) {
				String strNum = "";
				num = i * j;
				strNum = Integer.toString(num);
				//System.out.println(i+ " X " +j + " = " + num);
				String revNum = "";
				for (int k = strNum.length()-1; k>=0; k--){
				revNum = revNum + Character.toString(strNum.charAt(k));
				//System.out.println(" Reverse: " + revNum + " ");
				if (revNum.equals(strNum)) {
						Pallindrome = revNum;
					System.out.println(i + " X " + j + " = "+Pallindrome + " is a Pallindrome.");
					}
				}	
			}		
		}
		System.out.println("Largest Pallindrome is: "+ Pallindrome);
		}	
}