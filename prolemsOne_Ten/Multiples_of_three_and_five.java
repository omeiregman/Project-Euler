package prolemsOne_Ten;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * */


public class Multiples_of_three_and_five {

	public static void main(String[] args) {
		int sentinel = 1000;
		int factor = 0;
		for (int i=0; i<=sentinel-1; i++) {
			if ((i%3 == 0) || (i%5 == 0)) {
				System.out.println(i);
				factor += i;
			}
		}
		System.out.print(factor);
	}

}
