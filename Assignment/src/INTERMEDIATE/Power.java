package INTERMEDIATE;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("Enter the power");
        int p = in.nextInt();
        double  value = Math.pow(n,p);
        System.out.println("The Value is" + value);
    }
}
