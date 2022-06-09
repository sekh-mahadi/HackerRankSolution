package easy.recursion.String_recursion;

import java.util.HashSet;
import java.util.Set;

public class FindInterleavingsString {

	// Function to find all interleaving of string `X` and `Y`
	public static void findInterleavings(String curr, String X, String Y, Set<String> interleavings) {
		
		if (X.length() == 0 && Y.length() == 0) {
			interleavings.add(curr);
			System.out.println(curr);
			System.out.println(interleavings);
			return;
		}
		if (X.length() > 0) {
			
			String xSubstring = X.substring(1);
			System.out.println(xSubstring);
			findInterleavings(curr + X.charAt(0), X.substring(1), Y, interleavings);
		}

		if (Y.length() > 0) {
			//curr = curr + X.charAt(0);
			//String xSubstring = X.substring(1);
			findInterleavings(curr + Y.charAt(0), X, Y.substring(1), interleavings);
		}
	}

	public static Set<String> findInterleavings(String X, String Y) {
		Set<String> interleavings = new HashSet<>();
		
		if (X.length() == 0 && Y.length() == 0) {
			return interleavings;
		}

		findInterleavings("", X, Y, interleavings);

		return interleavings;
	}

	public static void main(String[] args) {
		String X = "ABC";
		String Y = "ACB";

		// use set to handle duplicates
		Set<String> interleavings = findInterleavings(X, Y);
		System.out.println(interleavings);
	}

}
