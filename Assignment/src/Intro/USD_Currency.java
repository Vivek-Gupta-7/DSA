package Intro;

import java.util.Scanner;

public class USD_Currency {
    public static void main(String[] args) {
        Scanner viv = new Scanner(System.in);
        System.out.println("Enter the amount in Rupees:");
        double Rupees = viv.nextFloat();
        double USD = (Rupees*0.01086);
        System.out.println("The Amount in dollar is:"+" "+USD+"$");


    }
}
