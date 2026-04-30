package Conditional;

import java.util.Scanner;

public class Total_surface_area_of_cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the Cube");
        double side = in.nextDouble();
        double result = 6*Math.pow(side,2);
        System.out.println("The Total Surface area of the cube is"+" "+ result);
        in.close();
    }
}
