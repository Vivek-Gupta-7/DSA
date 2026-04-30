package INTERMEDIATE;

import java.util.Scanner;

public class Calculate_commission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Amount");
        double A = in.nextDouble();
        System.out.println("Enter the Commission percentage ");
        double result= in.nextDouble();
        double commission = A*(result/100);
        System.out.println("The Commission percentage is " + commission );

    }
}
