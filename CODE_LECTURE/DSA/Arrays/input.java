package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements");
        int[] arr = new int[5];

        arr[0]= 220;
        arr[1]= 100000000;
        arr[2]= 22;
        arr[3]= 7;
        arr[4]= 22000;
        System.out.println(arr[3]);

        //input using for loops
        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


        // array of objects

        String[] str = new String[4];
        for(int j = 0; j<str.length; j++){
            str[j]= in.next();
        }

        System.out.println(Arrays.toString(str));


    }
}
