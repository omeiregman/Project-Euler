package prolemsOne_Ten;

/*Given three ints, a b c, return true if two or more of them have the same rightmost digit 
 * The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
 * lastDigit(23, 19, 13) = true
 * lastDigit(23, 19, 12) = false
 * lastDigit(23, 19, 3) = true
 */

import java.util.*;

public class NewProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tryInt();
		}
	
	public static void tryInt(){
		
		int a, b, c;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		a = scanner.nextInt();
		String aLast = Character.toString(Integer.toString(a).charAt(Integer.toString(a).length()-1));
		System.out.println("Enter value for b: ");
		b = scanner.nextInt();
		String bLast = Character.toString(Integer.toString(b).charAt(Integer.toString(b).length()-1));
		System.out.println("Enter value for c: ");
		c = scanner.nextInt();
		String cLast = Character.toString(Integer.toString(c).charAt(Integer.toString(c).length()-1));
		
		if (aLast.equals(bLast) || bLast.equals(cLast) || aLast.equals(cLast)){
			System.out.println(a + ", " + b + ", " + c + ": is True");
		} else {
			System.out.println(a + ", " + b + ", " + c + ": is False");
		}
	}
	
	
	public static void trySt() {
		
		String a, b, c;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		a = scanner.next();
		String aLast = Character.toString(a.charAt(a.length()-1));
		System.out.println("Enter value for b: ");
		b = scanner.next();
		String bLast = Character.toString(b.charAt(b.length()-1));
		System.out.println("Enter value for c: ");
		c = scanner.next();
		String cLast = Character.toString(c.charAt(c.length()-1));
		
		if (aLast.equals(bLast) || bLast.equals(cLast) || aLast.equals(cLast)){
			System.out.println(a + ", " + b + ", " + c + ": is True");
		} else {
			System.out.println(a + ", " + b + ", " + c + ": is False");
		}
	}
	
	
}
