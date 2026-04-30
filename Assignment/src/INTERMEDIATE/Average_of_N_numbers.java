package INTERMEDIATE;

import java.util.Scanner;

public class Average_of_N_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        long n = in.nextLong();

        // This was my approach
//        long sum =0;
//        for(long i =1;i<=n ; i++){
//            sum+=i;
//
//        }
//        long Avg=sum/n;
//        System.out.println("The Average of N numbers:" + " "+ Avg);


        // This is the approach gpt told me actually only the formula

        long Avg= n*(n+1)/2;
        System.out.println("The Average of the number"+" "+n + " "+"is"+" "+ Avg);

    }
}
