package Intro;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String value = sc.nextLine();
        String reversed = "" ;
        for(int i = value.length()-1; i>=0;i--){
            reversed += value.charAt(i);

        }
        System.out.println(reversed);
        if(reversed == value ){
            System.out.println("The given String is a palindrome");

        }
        else{
            System.out.println("The Given String is not a Palindrome");
        }

        sc.close();

    }
}
