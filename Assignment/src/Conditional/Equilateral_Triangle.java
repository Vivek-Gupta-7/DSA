package Conditional;

import java.util.Scanner;

public class Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Side of Equilateral Triangle");
        double side= in.nextInt();
        double result=(Math.sqrt(3)/4)*side*side;
        System.out.println("The area of the Equilateral Triangle is" + " "+ result);
        in.close();
    }
}
