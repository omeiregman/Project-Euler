package prolemsOne_Ten;


/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 100001st prime number?
 * */
public class prime_100001st {

	public static void main(String[] args) {


		int count = 3;
		int prime = 2;
		while (count <= 10){
			for (int i=2; i<=count; i++){
				if (count%i != 0){
					System.out.println(count);
					count++;
				} else {
					
					count++;
				}
			}
		}

	}

}
