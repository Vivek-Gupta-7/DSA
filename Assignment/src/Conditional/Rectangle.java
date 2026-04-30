package Conditional;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Length of Rectangle");
        long length= in.nextInt();
        System.out.println("Enter the Breadth of Rectangle");
        long breadth = in.nextInt();
        long result=length*breadth;
        System.out.println("The area of the Rectangle is" + " "+ result);
        in.close();
    }
}
