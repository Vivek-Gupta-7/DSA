package DSA.Function;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        sum();
        System.out.println( sum3(7,7));

    }

    static int sum3(int a , int b){
        int sum = a+b;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter the number2:");
        int num2 = in.nextInt();

        int sum = num1+num2;
        System.out.println("The sum of the numbers is " + sum);

    }
}

