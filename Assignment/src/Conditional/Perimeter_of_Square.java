package Conditional;

import java.util.Scanner;

public class Perimeter_of_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the Square");
        long side = in.nextLong();
        long result = 4*side;
        System.out.println("The Perimeter of the Square is"+" "+ result);
        in.close();

    }
}
