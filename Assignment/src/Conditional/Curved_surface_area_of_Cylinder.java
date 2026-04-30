package Conditional;

import java.util.Scanner;

public class Curved_surface_area_of_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the CSA:");
        double radius = in.nextDouble();
        System.out.println("Enter the height of the CSA:");
        double height = in.nextDouble();
        double result = 2*3.14*radius*height;
        System.out.println("The Curved Surface area of the Cylinder is" + " "+ result);
        in.close();
    }
}
