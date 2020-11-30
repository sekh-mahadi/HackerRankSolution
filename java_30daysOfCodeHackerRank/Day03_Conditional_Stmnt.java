package java_30daysOfCodeHackerRank;

import java.util.Scanner;

public class Day03_Conditional_Stmnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(N%2==1){
            System.out.println("Weird");
        }else {
            if(N>=6 && N<=20){
                System.out.println("Weird");
            }else {
                System.out.println("Not Weird");
            }
        }
    }
}
