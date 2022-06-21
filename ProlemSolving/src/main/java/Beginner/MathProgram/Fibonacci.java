package Beginner.MathProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Fibonacci {

	// 1st Method:
	public static void fibonacci(int n) {
		int f = 0;
		int f1 = 0, f2 = 1;

		System.out.print("Fibonacci Series: " + f1 + " " + f2);

		int i = 0;
		do {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			System.out.print(" " + f);
			i++;
		} while (i <= n);
		System.out.println();
	}

	// 2nd Method: Using Recursion

	public static int fibonacciUsingRecursion(int n) {

		if (n <= 1) {
			return n;
		}

		return fibonacciUsingRecursion(n - 1) + fibonacciUsingRecursion(n - 2);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		fibonacci(n);

		// using recursion
		for (int i = 0; i < n; i++) {
			System.out.println(fibonacciUsingRecursion(i));
		}

	}

}
