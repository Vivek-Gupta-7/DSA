package Conditional;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Diagonal1 of Rhombus");
         double diagonal1= in.nextInt();
        System.out.println("Enter the Diagonal2 of Rhombus");
         double diagonal2= in.nextInt();
         double result=(diagonal1*diagonal2)*0.5;
        System.out.println("The area of the Rhombus is" + " "+ result);
        in.close();
    }
}
