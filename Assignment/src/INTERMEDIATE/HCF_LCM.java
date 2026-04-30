package INTERMEDIATE;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = 0;
        for(int i=1; i<=a; i++){
            if(a%i==0 && b%i==0){
                hcf = i;


            }

        }
        int lcm = a*b/hcf;
        System.out.println("The HCF of the numbers is "+ hcf);
        System.out.println("The LCM of the numbers is" + lcm);


    }
}
