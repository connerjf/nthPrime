package nthPrime;

public class nthPrimes {

	public static void main(String[] args) {
		
		int numOfPrime = 10001;
		int primeCounter = 2;
		int num = 1;
		if (numOfPrime == 1) {
			System.out.println("Prime #1 is: " + 2);
		} else {
			while (primeCounter <= numOfPrime) {
				num += 2;
				if (isPrime(num)) {
					primeCounter++;
				}
			}
			System.out.println("Prime #" + numOfPrime + " is: " + num);
		}
	}
	
	public static boolean isPrime(int i) {
		int sqrt = (int) (Math.sqrt(i) + 2);
		if (i < 2) {
			return false;
		}
		if (i == 2 || i == 3) {
			return true;
		}
		if (i % 2 == 0) {
			return false;
		}
		for (int x = 3; x <= sqrt; x += 2) {
			if (i % x == 0) {
				return false;
			}
		}
		return true;
	}
	

}
