package Conditional;

import java.util.Scanner;

public class largest_num_till_0_is_entered {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int largest=0;
        while(true){
            int num=in.nextInt();
            if(num==0){
                System.out.println("User entered the number 0");
                break;


            }
            if(num>largest){
                largest = num;

            }
        }
        System.out.println("The largest number is:"+ " "+ largest);
        in.close();
    }
}
