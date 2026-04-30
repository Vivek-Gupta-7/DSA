package INTERMEDIATE;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        int original = n;

        //count digit
        int temp = n;
        int count = 0;
        while(temp>0) {
            temp = temp/ 10;
            count++;


        }
       // Armstrong calculation
        temp =n;
        int rem =0;
        int sum =0;
        while(temp>0){
            rem= temp%10;
            int arm = (int)Math.pow(rem,count);
            sum+=arm;
            temp = temp/10;

        }
        if(sum==original){
            System.out.println("The no. is Armstrong");
        }
        else {
            System.out.println("The number is not armstrong");
        }


    }
}
