package DSA.Conditional;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the inputs");
        int a = in.nextInt();
        int b = in.nextInt();
        int c= in.nextInt();

//        if(a>b && a>c){
//            System.out.println(a + "is the largest");
//        }
//        else if(b>a && b>c){
//            System.out.println(b + "is the largest");
//        }
//        else{
//            System.out.println(c + "is the largest");
//        }
//        in.close();

        // or the other method

//        int max=a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println(max);

        // 3rd method
        int max =0;
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        if(c>max){
            max=c;
        }
         max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}

