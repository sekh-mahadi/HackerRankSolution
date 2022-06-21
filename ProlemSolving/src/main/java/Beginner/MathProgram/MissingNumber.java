package Beginner.MathProgram;

public class MissingNumber {

	// Method 1
	public static int missingNumber(int arr[], int n) {
		int total = 1;

		for (int i = 2; i <= (n + 1); i++) {
 			total += i;
			total -= arr[i - 2];
		}
		return total;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		System.out.println(missingNumber(arr, arr.length));
	}

}
