package Conditional;

import java.util.Scanner;

public class Volume_of_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        double radius = in.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double height = in.nextDouble();
        double result = 3.14*radius*radius*height;
        System.out.println("The Volume of the Cylinder is" + " "+ result);
        in.close();
    }
}
