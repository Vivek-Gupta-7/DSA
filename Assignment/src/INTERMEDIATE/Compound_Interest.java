package INTERMEDIATE;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        double P = in.nextDouble();
        System.out.println("Enter the Rate of Interest");
        double R = in.nextDouble();
        System.out.println("Enter the time in years");
        double T = in.nextDouble();

        double  v =(1+(R/100));
        double A = P*Math.pow(v,T);

        System.out.println("The compound interest is " + A);
    }
}
