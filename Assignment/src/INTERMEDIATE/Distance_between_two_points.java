package INTERMEDIATE;

import java.util.Scanner;

public class Distance_between_two_points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first point");
        int p1 = in.nextInt();
        System.out.println("Enter the second point");
        int p2 = in.nextInt();
        int d = p2 -p1;
        System.out.println("The distance between two points are:" + d);


    }

}
