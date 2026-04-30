package Conditional;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Height of Parallelogram");
        long Height= in.nextInt();
        System.out.println("Enter the Breadth of Parallelogram");
        long breadth = in.nextInt();
        long result=Height*breadth;
        System.out.println("The area of the Parallelogram is" + " "+ result);
        in.close();

    }
}
