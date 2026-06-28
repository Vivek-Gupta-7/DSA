package Conditional;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Height of Triangle");
        int Height= in.nextInt();
        System.out.println("Enter the Base of Triangle");
        int Base= in.nextInt();
        // THE FORMULA TO CALCULATE THE AREA OF TRIANGLE IS 1/2*HEIGHT*BASE
        double result=0.5*Height*Base;
        System.out.println("The area of the Triangle is" + " "+ result);
        in.close();
    }
}
