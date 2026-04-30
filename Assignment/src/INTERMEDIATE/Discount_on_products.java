package INTERMEDIATE;

import java.util.Scanner;

public class Discount_on_products {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Price of the Product");
        double price = in.nextDouble();
        System.out.println("Enter the discount in percentage to be given on the Product");
        double discount = in.nextDouble();
        double DSP = price*(discount/100);
        double value = price - DSP;
        System.out.println("The Price after discounting " + discount+ " %" + " " + "is" + " "+ value);
    }
}
