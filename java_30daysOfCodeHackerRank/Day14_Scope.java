package java_30daysOfCodeHackerRank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] elements) {
        this.elements = elements;

    }

    public void computeDifference() {
        int minNum;
        for (int i = 0; i < elements.length - 1; i++) {
            minNum = elements[i];
            for (int j = i; j < elements.length - 1; j++) {
                int absResult = Math.abs(minNum - elements[j + 1]);
                if (maximumDifference < absResult) {
                    maximumDifference = absResult;
                }
            }
        }
    } // End of Difference class
}

public class Day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}