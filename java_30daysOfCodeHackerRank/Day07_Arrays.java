package java_30daysOfCodeHackerRank;

import java.util.Scanner;

public class Day07_Arrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int len = arr.length;

        for(int k= 0; k < len/2; k++){
            int temp = arr[k];
            arr[k] = arr[len - k - 1];
            arr[len -k-1] =temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }
}
