package INTERMEDIATE;

import java.util.Scanner;

public class Batting_Avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total score the player had made");
        int S = in.nextInt();
        System.out.println("Enter the no. of times player has lost");
        int L = in.nextInt();
        int BA=S/L;
        System.out.println("The Batting Average is " + BA);
    }
}
