package INTERMEDIATE;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Units consumed:");
        double Units = in.nextDouble();
        System.out.println("Enter the Cost per unit:");
        double Cost = in.nextDouble();
        double Electricity = Units*Cost;
        System.out.println("The Electricity Bill is"+" "+ Electricity + " units");



    }
}
