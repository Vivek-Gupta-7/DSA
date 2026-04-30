package Conditional;

import java.util.Scanner;

public class CIRCLE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int radius= in.nextInt();
        double result=radius*radius*3.14;
        System.out.println("The area of the Circle is" + " "+ result);
        in.close();
    }
}
