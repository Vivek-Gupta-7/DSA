package Conditional;

import java.util.Scanner;

public class Volume_of_Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base area of the pyramid:");
        double base_area = in.nextDouble();
        System.out.println("Enter the height of the pyramid:");
        double height = in.nextDouble();
        double result = 1.0/3*base_area*height;
        System.out.println("The Volume of the pyramid is" + " "+ result);
        in.close();
    }
}
