package Conditional;

import java.util.Scanner;

public class sum_of_all_num_till_specific_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");

        int sum=0;

        while(true){
            int num=in.nextInt();

            if(num==0){
                System.out.println("User entered the number 0");
                break;



            }
            sum+=num;



        }
        System.out.println("The sum of all the number are: "+ " "+ sum);
        in.close();


    }
}
