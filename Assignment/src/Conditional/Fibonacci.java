package Conditional;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms for fibonacci series");
        int n = in.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=1; i<=n;i++){
            System.out.print(a + " ");
             c = a+b;
             a=b;
             b=c;


        }



    }
}
