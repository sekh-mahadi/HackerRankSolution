package java_30daysOfCodeHackerRank;

import java.util.Scanner;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class CalculatorInterface implements AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        int sum =0, divisor;

        int i=1;
        while(i<=n){
            divisor = n%i;
            if(divisor==0){
                sum = sum +i;
            }
            i++;
        }
        return sum;
    }
}
public class Day19_Interfaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        AdvancedArithmetic myCalculator = new CalculatorInterface();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: "+ myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
