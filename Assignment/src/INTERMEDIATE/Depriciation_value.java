package INTERMEDIATE;

import java.util.Scanner;

public class Depriciation_value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int P = in.nextInt();

        // slavage amount
        int D = in.nextInt();
        int T = in.nextInt();
        int R = (P-D)/T;
        System.out.println("The Depriciating value per year is " + R);
    }
}
