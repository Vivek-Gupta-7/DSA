package Intro;

import java.util.Scanner;

public class largest_of_2 {
    public static void main(String[] args) {
        Scanner viv = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = viv.nextInt();
        System.out.println("Enter the second number:");
        int b = viv.nextInt();
        if(a>b){
            System.out.println("The largest of two number is" + a);
        }
        else {
            System.out.println("The largest of two number is" +" "+ b);
        }
        viv.close();

    }
}
