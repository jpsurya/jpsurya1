package day9;

public class PrimeNumber {
	public void findPrimeNumber(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			System.out.println("is prime");
		} else {
			System.out.println("not a prime");
		}
	}

}
