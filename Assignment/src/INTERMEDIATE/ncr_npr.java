package INTERMEDIATE;

import java.util.Scanner;

public class ncr_npr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = in.nextInt();
        System.out.println("Enter value of r");
        int r = in.nextInt();
        
        int combination = factorial(n)/(factorial(r)*factorial(n-r));
        int permutation = factorial(n)/factorial(n-r);
        System.out.println("The value of Combination is " + combination);
        System.out.println("The value of permutation is " + permutation);
    }

     static int factorial(int n) {

        int fact =1;
        for(int i = 1;i<=n;i++){
             fact *=i;
        }
        return fact;
    }
}
