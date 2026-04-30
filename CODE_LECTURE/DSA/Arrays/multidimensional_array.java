package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensional_array {
    public static void main(String[] args) {
        /*
           1 2 3
           4 5 6
           7 8 9
         */

        Scanner in = new Scanner(System.in);

//        int[][] arr = new int[3][];
//        int[][] arr = {
//                {1,2,3},// 0th index
//                {4,5},// 1st index
//                {6,7,8,9} // 2nd index
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);// no of rows

        // input
        for(int row =0; row<arr.length; row++){
            // for each col in every row
            for(int col=0; col<arr[row].length; col++){
                arr[row][col]= in.nextInt();
            }
        }

        //output
        // way 1 to print array
        for(int row =0; row<arr.length; row++){
            // for each col in every row
            for(int col=0; col<arr[row].length; col++){// if column length is not fixed for every row then we can used this .
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


        // way 2 to print array (as each row is an array itself)
        for(int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }



        // way 3 to print array using advanced for loop
        for(int[] a: arr){ // here every element(oth index, 1st index, 2nd index is an array itself) so we have define int[] a(this represent an array)
            System.out.println(Arrays.toString(a));
        }








    }
}
