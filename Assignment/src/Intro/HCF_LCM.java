package Intro;



import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        int hcf =0;

        // to find factor for HCF
        for(int i = 1; i <=b; i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }

        }
        System.out.println("The Highest common Factor is:"+" "+ hcf);

        // to find lcm we have formula
        int lcm = a*b/hcf;
        System.out.println("The LCM is:"+" "+ lcm);
        sc.close();
    }


}
