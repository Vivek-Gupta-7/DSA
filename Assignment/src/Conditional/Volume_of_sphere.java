package Conditional;

import java.util.Scanner;

public class Volume_of_sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        double radius = in.nextDouble();
        double result = (4.0/3)*Math.pow(radius,3);
        System.out.println("The Volume of the sphere is" + " "+ result);
        in.close();
    }
}
