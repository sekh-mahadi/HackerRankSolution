package java_30daysOfCodeHackerRank;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day0_HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);
        File file = new File("Output/Hello.txt");

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        //create file
        try {
            boolean createFile = file.createNewFile();
            if (createFile) {
                System.out.println("New File is created.");
                FileWriter fw = new FileWriter("Output/Hello.txt");
                fw.write(inputString);
                fw.close();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);

    }
}

