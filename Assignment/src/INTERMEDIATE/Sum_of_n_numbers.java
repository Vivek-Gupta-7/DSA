package INTERMEDIATE;

import java.util.Scanner;

public class Sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = in.nextInt();
        System.out.println("Enter the each number");
        int sum=0;
        for(int i =1 ; i<=n;i++){
            int value = in.nextInt();
            sum+=value;;


        }
        System.out.println("The Sum of N number are: " +sum );
    }
}
