package prolemsOne_Ten;

public class PrimeFactors {

	public static void main(String[] args) {
		
		long factorNumber = 600851475143L;
		long prime =0;
		long factor = 0;
		
		for (long i=2; i<factorNumber; i++){
			if (factorNumber % i == 0){
				factor = i;
				//System.out.println("Factor: " +factor);	
				}
			for (long j=2; j<=factor; j++) {
					if(factor%j == 0 && factor != j)
						break;
					if (factor%j ==0 && factor == j){
						if (prime != j){
						prime = j;
						System.out.println("Prime: " +prime);
						}
					}
				}
			}
	}
}