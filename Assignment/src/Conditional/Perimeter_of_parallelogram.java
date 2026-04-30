package Conditional;

import java.util.Scanner;

public class Perimeter_of_parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the Parallelogram");
        double length = in.nextDouble();
        System.out.println("Enter the breadth of the Parallelogram");
        double breadth = in.nextDouble();
        double result = 2*(length + breadth);
        System.out.println("The Perimeter of the Parallelogram is"+" "+ result);
        in.close();
    }
}
