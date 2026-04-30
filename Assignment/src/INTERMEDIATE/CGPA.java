package INTERMEDIATE;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Subjects");
        int n = in.nextInt();
        System.out.println("Enter the grade points of each subjects");
        int sum =0;
        double CGPA=0;
        for (int i = 1; i<=n;i++){
            int G=in.nextInt();
            sum+=G;
            CGPA = sum/n;



        }
        System.out.println("The CGPA is " + CGPA);
    }
}
