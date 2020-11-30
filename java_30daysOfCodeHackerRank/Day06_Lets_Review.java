package java_30daysOfCodeHackerRank;

import java.util.Scanner;

public class Day06_Lets_Review {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            String strEven = "", strOdd = "";
            String str = scan.next();
            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) {
                    strEven = strEven + str.charAt(j);
                } else {
                    strOdd = strOdd + str.charAt(j);
                }
            }
            System.out.println(strEven + " " + strOdd);
//            strEven = "";
//            strOdd = "";
        }
    }
}
