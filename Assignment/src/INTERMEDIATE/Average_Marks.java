package INTERMEDIATE;

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of subjects");
        int  n = in.nextInt();
        System.out.println("Enter the marks of each subjects");
        double sum =0;
        double avg=0;
        for(int i =1; i<=n; i++){
            double marks = in.nextDouble();
            sum+=marks;

            avg = sum/n;


        }
        System.out.println("The Average Marks " + avg);
    }
}
