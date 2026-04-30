package INTERMEDIATE;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number:");
        long n = in.nextLong();
        long fact=1;
        for(int i = 1; i<=n;i++){
            fact = fact*i;


        }
        System.out.println("The factorial of"+" "+ n +" "+fact );

    }
}
