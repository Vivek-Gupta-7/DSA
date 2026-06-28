package Conditional;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // SCANNER WILL HELP TO TAKE THE INPUT
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms for fibonacci series");
        int n = in.nextInt();
        // WE HAVE TAKE THREE VARIABLES, IT WILL HELP TO SWAP VALUES . 
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
