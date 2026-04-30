package Conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Volume_of_Prism {
    public static void main(String[] args) {
        System.out.println("Select any Volume of prism to be calculated");
        System.out.println("1. Triangular Prism");
        System.out.println("2. Rectangular Prism");
        System.out.println("3. Square Prism");
        System.out.println("4. Pentagonal Prism");
        System.out.println("5. Hexagonal Prism");
        System.out.println("6. Heptagonal Prism");
        System.out.println("7. Octagonal Prism");
        System.out.println("8. Trapezoidal Prism");

        Scanner in = new Scanner(System.in);
        System.out.println("Select the Prism");
        int no = in.nextInt();
        if (no==1){
            System.out.println("Enter the breadth of Triangle");
            double breadth = in.nextDouble();
            System.out.println("Enter the length of Triangle");
            double length = in.nextDouble();
            System.out.println("Enter the height of Triangle");
            double height = in.nextDouble();

            double result = 0.5*breadth*length*height;
            System.out.println("The Volume of Triangular prism is:" + " "+ result);
        }

        else if (no==2){
            System.out.println("Enter the width of Rectangular");
            double width = in.nextDouble();
            System.out.println("Enter the length of Rectangular");
            double length = in.nextDouble();
            System.out.println("Enter the height of Rectangular");
            double height = in.nextDouble();

            double result = width*length*height;
            System.out.println("The Volume of Rectangular prism is:" + " "+ result);
        }

        else if (no==3){
            System.out.println("Enter the side of Square");
            double side = in.nextDouble();
            System.out.println("Enter the length of Rectangular");
            double length = in.nextDouble();


            double result = side*side*length;
            System.out.println("The Volume of Square prism is:" + " "+ result);
        }

        else if (no==4){
            System.out.println("Enter the apothem of Pentagonal");
            double apothem = in.nextDouble();
            System.out.println("Enter the base edge of Pentagonal");
            double base_edge = in.nextDouble();
            System.out.println("Enter the height of Pentagonal");
            double height = in.nextDouble();

            double result = 2.5*apothem*base_edge*height;
            System.out.println("The Volume of Pentagonal prism is:" + " "+ result);
        }

        else if (no==5){
            System.out.println("Enter the apothem of Hexagonal");
            double apothem = in.nextDouble();
            System.out.println("Enter the base edge of Hexagonal");
            double base_edge = in.nextDouble();
            System.out.println("Enter the height of Hexagonal");
            double height = in.nextDouble();

            double result = 3*apothem*base_edge*height;
            System.out.println("The Volume of Hexagonal prism is:" + " "+ result);
        }

        else if (no==6){
            System.out.println("Enter the base edge of Heptagonal");
            double base_edge = in.nextDouble();
            System.out.println("Enter the height of Heptagonal");
            double height = in.nextDouble();

            double result = 1.75*base_edge*base_edge*height*1/(Math.tan(Math.PI/7));
            System.out.println("The Volume of Heptagonal prism is:" + " "+ result);
        }

        else if (no==7){
            System.out.println("Enter the base edge of Heptagonal");
            double base_edge = in.nextDouble();
            System.out.println("Enter the height of Heptagonal");
            double height = in.nextDouble();

            double result =2*(1+Math.sqrt(2))*base_edge*base_edge*height;
            System.out.println("The Volume of Heptagonal prism is:" + " "+ result);
        }

        else if (no==8){
            System.out.println("Enter the base edge of Trapezoidal");
            double base_edge = in.nextDouble();
            System.out.println("Enter the short_Base_edge of Trapezoidal");
            double Short = in.nextDouble();
            System.out.println("Enter the length of Trapezoidal");
            double length = in.nextDouble();
            System.out.println("Enter the height of HTrapezoidal");
            double height = in.nextDouble();

            double result = 0.5*(base_edge + Short)*height*length;
            System.out.println("The Volume of Trapezoidal prism is:" + " "+ result);
        }

        else {
            System.out.println("Enter the correct input");
        }

        in.close();



    }
}
