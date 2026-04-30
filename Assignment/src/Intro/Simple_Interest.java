package Intro;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner viv = new Scanner(System.in);
        System.out.println("Enter the Principal Amount:");
        float Principal = viv.nextFloat();
        System.out.println("Enter the time in year:");
        int Time = viv.nextInt();
        System.out.println("Enter the Rate:");
        float Rate = viv.nextFloat();
        float Simple_interest = (Principal*Time*Rate)/100;
        System.out.println("The simple Interest is:" + Simple_interest);
    }
}
