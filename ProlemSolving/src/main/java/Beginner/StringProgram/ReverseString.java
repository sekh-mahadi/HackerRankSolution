package Beginner.StringProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	// 1st Method: Reverse String Without using Built in method
	public static String reverseString(String str) {

		char[] result = str.toCharArray();
		int len = result.length - 1;

		for (int i = 0; i < result.length / 2; i++) {
			SwapString(result, len, i);
			len--;
		}

		return new String(result);
	}

	// 2nd Method: Reverse String Using Array

	public static String reverseStringUsingArray(String str) {

		String result = "";
		int len = str.length();

		// create a character array of the same size as that of string
		char[] temp = new char[len];

		if (str == null || str.equals("")) {
			return str;
		}
		char[] originalString = str.toCharArray();

		for (int i = originalString.length - 1; i >= 0; i--) {
			result = result + originalString[i];
		}

		for (int i = 0; i < len; i++) {
			temp[len - i - 1] = str.charAt(i);
		}

		return String.copyValueOf(temp);
		// return result;
	}
	
	static public String reverStringUsingRLO(String str) {
		return "\u202E"+str;
	}

	private static void SwapString(char[] result, int len, int i) {
		char temp = result[i];
		result[i] = result[len];
		result[len] = temp;
	}

	// 3rd Method: Using StringBuilder
	static public String ReverseStringUsingStringBuilder(String str) {

		StringBuilder inputString = new StringBuilder();
		inputString.append(str);

		// reverse in built method
		inputString.reverse();

		return new StringBuffer(str).reverse().toString();
		// return inputString.toString();
	}

	public static void main(String[] args) throws IOException {
		String str = "Mahadi";
		String result = reverseString(str);

		System.out.println("Reverse String: " + result);
		String resultUsingArray = reverseStringUsingArray(str);

		System.out.println("Reverse String Using Array: " + resultUsingArray);

		String resultStringBuilder = ReverseStringUsingStringBuilder(str);
		System.out.println("Reverse String Using StringBuilder: " + resultStringBuilder);

		String resultOfRLO = reverStringUsingRLO(str);
		
		System.out.println("Reverse String Using Unicode Right-to-left override: " + resultOfRLO);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("Reverse_String.txt"));

		bw.write("Reverse String: " + result + "\n" + "Reverse String Using Array: " + resultUsingArray + "\n"
				+ "Reverse String Using StringBuilder: " + resultStringBuilder);
		br.close();
		bw.close();
	}

}

/* Write a program for reverse String */