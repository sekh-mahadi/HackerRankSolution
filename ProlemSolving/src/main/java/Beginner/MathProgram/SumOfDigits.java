package Beginner.MathProgram;

public class SumOfDigits {

	public static int sumOfDigits(int num) {
		int sum = 0, r;

		while (num != 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(1234));
	}

}
