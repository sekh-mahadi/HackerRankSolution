package java_30daysOfCodeHackerRank;

import java.util.Scanner;

public class Day16_Exception {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int i = 0;
        try {
            i = Integer.parseInt(S);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
