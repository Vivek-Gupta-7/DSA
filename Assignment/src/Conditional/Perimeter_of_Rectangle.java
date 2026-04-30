package Conditional;

import java.util.Scanner;

public class Perimeter_of_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle");
        double length = in.nextDouble();
        System.out.println("Enter the breadth of the Rectangle");
        double breadth = in.nextDouble();
        double result = 2*(length + breadth);
        System.out.println("The Perimeter of the Rectangle is"+" "+ result);
        in.close();
    }
}
