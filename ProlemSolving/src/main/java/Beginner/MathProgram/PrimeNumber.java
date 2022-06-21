package Beginner.MathProgram;

public class PrimeNumber {

	public static boolean isPrimeNumber(int n) {

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true; // means number wasn't divisible by any of the number, it's a prime number.
	}

	public static void primeNumber(int num) {
		String primeNumbers = "";
		int counter = 0;
		int flag = 0;
		for (int i = 2; i < num; i++) {

			/*
			 * if (isPrimeNumber(i)) { //System.out.println(i); }
			 */
			for (int k = 2; k <= Math.sqrt(i); k++) {
				if (i % k == 0) {
					// flag = 1;
					counter++;
					// System.out.print(i+" ");
					break;
				}
			}
			if (counter == 0) {
				primeNumbers = primeNumbers + i + " ";
			}else {
				counter = 0;
			}
		}
		System.out.println(primeNumbers);
	}

	public static void main(String[] args) {
		primeNumber(100);

		System.out.println(isPrimeNumber(9));
	}

}
