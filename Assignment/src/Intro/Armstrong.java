package Intro;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        // to find the Armstrong by initializing the value
        int n = 153;
        int temp = n;
        int rem , sum =0;

       while(n>0) {
           rem = n % 10;
            n = n / 10;
           sum += rem * rem * rem;
       }
       if(sum == temp){
           System.out.println("The given number is palindrome");
       }
       else{
           System.out.println("The given number is not palindrome");
       }



        // using for loop and all the armstrong between two numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int V=sc.nextInt();
        System.out.println("Enter Second number:");
        int P=sc.nextInt();


        for(int i = V; i<=P ;i++) {

                temp = i;
            int count=0;
                 sum=0;

            // count digit
            while(temp != 0) {
                count++;
                temp = temp / 10;
            }

            temp = i;


            //calculate the sum of digit^count
            while(temp > 0) {
                rem = temp % 10;
               sum += (int)Math.pow(rem,count);
                temp /= 10;
            }

            if(sum == i){
                System.out.println(i + " "+ "is an Armstrong");

            }


        }

        sc.close();

    }
}
