package java_30daysOfCodeHackerRank;

import java.io.*;
import java.util.*;

public class Day01_DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        File file = new File("Output/Data Types.txt");
        /* Declare second integer, double, and String variables. */
        /*int i1;
        double d1;
        String s1;*/
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and     review the Tutorial closely.
       /* i1 = scan.nextInt();
        d1 = scan.nextDouble();
        scan.nextLine();
        s1 = scan.nextLine();*/
        /* Declare second integer, double, and String variables. */
        int j = 12;
        double d1 = 4.0;
        String s1 = "is the best place to learn and practice coding!";
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d1);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + s1);
        try {
            boolean createFile = file.createNewFile();
            if (createFile) {
                System.out.println("New File is created.");
                FileWriter fw = new FileWriter("Output/Data Types.txt");
                fw.write(String.valueOf(i+j)+"\n");
                fw.write(String.valueOf(d + d1)+"\n");
                fw.write(s + s1);
                fw.close();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        scan.close();
    }
}