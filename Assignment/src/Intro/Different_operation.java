package Intro;

import java.util.Scanner;

public class Different_operation {
    public static void main(String[] args) {
        Scanner viv = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = viv.nextInt();
        System.out.println("Enter the second number:");
        int b = viv.nextInt();
        System.out.println("Select a number for operation(1/2/3/4)");
        int option = viv.nextInt();
        if (option == 1) {
            int sum = a + b;
            System.out.println("The sum of the numbers is:" + sum);
        } else if (option == 2) {
            int Substraction = a - b;
            System.out.println("The Substraction of the numbers is:" + Substraction);

        } else if (option == 3) {
            int Multiplication = a * b;
            System.out.println("The Multiplication of the numbers is:" + Multiplication);

        } else if (option == 4) {
            int Divide = a / b;
            System.out.println("The Divide of the numbers is:" + Divide);

        } else {
            System.out.println("Enter a valid option");
        }


        viv.close();


    }
}
