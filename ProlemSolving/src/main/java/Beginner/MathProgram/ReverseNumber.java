package Beginner.MathProgram;

public class ReverseNumber {

	// Using Do While
	static public int reverseNumber(int num) {

		int result = 0, r;
		while (num != 0) {
			r = num % 10;
			result = (result * 10) + r;
			num = num / 10;
		}
		return result;
	}

	// Using Recursion
	static public int reverseNumberUsingRecursion(int num) {

		System.out.println(num);
		int len = (int) (Math.log10((double) num) + 1);

		int result = 0, rem;
		if (len == 1) {
			return num;
		} else {
			System.out.println(len);

			rem = num % 10;
			result = (result * 10) + rem;

			System.out.println((int) (rem * Math.pow(10, --len)));
			return (int) (rem * Math.pow(10, len)) + reverseNumberUsingRecursion(num / 10);

		}
	}

	public static void main(String[] args) {

		int num = 123;

		int reverseNum = reverseNumber(num);
		// System.out.println(reverseNum);

		int reverseNum2 = reverseNumberUsingRecursion(num);
		System.out.println(reverseNum2);
	}

}
