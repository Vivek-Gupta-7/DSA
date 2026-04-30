package Intro;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner viv = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = viv.nextInt();
        if (number % 2 == 0) {

            System.out.println(number +" " +"is Even");
        }
        else{
            System.out.println(number +" "+ "is odd");
        }

    }
}
