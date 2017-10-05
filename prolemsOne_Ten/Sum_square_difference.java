package prolemsOne_Ten;

/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural 
numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 */

//import java.util.*;

public class Sum_square_difference {

	public static void main(String[] args) {


		int sentinel = 100;
		double square, square_sumNum;
		double sum = 0f;
		double sumNum=0;
		
		
		for (int i =0; i<=sentinel; i++){
			
			square = Math.pow(i, 2);
			sum += square;
			sumNum+=i;
		}
			
		square_sumNum = Math.pow(sumNum, 2);
		System.out.println("Sum of Squares: " + String.format("%.1f", square_sumNum) +", Square of the sum: " + sum );
		Double diff = (square_sumNum - sum);
		System.out.println("Difference: " + String.format("%.1f", diff));

	}
	

}
