package Conditional;

import java.util.Scanner;

public class Volume_of_Cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the Cone");
        double radius = in.nextDouble();
        System.out.println("Enter the height of the Cone");
        double height = in.nextDouble();
        double result = 0.33*(3.14*radius*radius*height);
        System.out.println("The Volume of Cone is"+" "+ result);
        in.close();

    }
}
