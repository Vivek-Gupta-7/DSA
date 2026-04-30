package Conditional;

import java.util.Scanner;

public class Perimeter_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Side of the Perimeter of Equilateral Triangle");
        double side = in.nextDouble();
        double result = 3*side*0.5;
        System.out.println("The Perimeter of the Perimeter of Equilateral Triangle is"+" "+ result);
        in.close();

    }
}
