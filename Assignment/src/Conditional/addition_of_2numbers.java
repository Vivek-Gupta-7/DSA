package Conditional;

import java.util.Scanner;

public class addition_of_2numbers {
    public static void main(String[] args) {

        // CALCULATE TWO NUMBERS (ADDITION)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();

        int c = a+b;
        System.out.println("The sum of two numbers are "+ " "+ c);
        in.close();
    }
}
