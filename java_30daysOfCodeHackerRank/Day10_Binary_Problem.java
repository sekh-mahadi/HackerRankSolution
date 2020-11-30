package java_30daysOfCodeHackerRank;

import java.util.Scanner;

public class Day10_Binary_Problem {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int r, maxResult = 0, counter = 0;
        String result = "";
        while (n > 0) {
            r = n % 2;
            if (r == 1) {
                counter++;
                if (counter > maxResult) {
                    maxResult = counter;
                }
            } else {
                counter = 0;
            }

            result = result + r;
            n = n / 2;
        }
        System.out.println(maxResult);
        scanner.close();
    }
}
