package Conditional;

import java.util.Scanner;

public class Perimeter_of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle");
        double radius = in.nextDouble();
        double result = 2*3.14*radius;
        System.out.println("The Perimeter of the circle is"+" "+ result);
        in.close();

    }
}
