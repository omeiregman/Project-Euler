package prolemsOne_Ten;


import java.util.*;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int armstrongNum;
		String armString;
		String armstrong;
		int numSum =0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Number:  ");
		armstrongNum = scanner.nextInt();
		
		armString = Integer.toString(armstrongNum);
		int length = Integer.valueOf(armstrongNum).toString().length();
		
		
		for (int i = 0; i<length; i++) {
			armstrong = Character.toString(armString.charAt(i)); 
			
			int armstrongCheck = (int) Math.pow(Integer.parseInt(armstrong), length);
			
			numSum = numSum + armstrongCheck;
		//	System.out.println(i +" = " + armstrong + " ::: Armstrong Check = " + numSum);
			
		}
		if (numSum == armstrongNum) {
			System.out.println(armstrongNum + " is an Amstrong Number");
		} else {
			System.out.println(numSum + " is not an Amstrong Number");
		}
	}
}