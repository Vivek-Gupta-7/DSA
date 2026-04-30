package Conditional;

import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Length of Isosceles Triangle");
        long length= in.nextInt();
        System.out.println("Enter the Breadth of Isosceles Triangle");
        long breadth = in.nextInt();
        long result=length*breadth;
        System.out.println("The area of the Isosceles Triangle is" + " "+ result);
        in.close();

    }
}
