package Linera_search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int [][] arr ={
                {23,4,1},
                {18,12,3,8},
                {78,88,99,34,56},
                {18,12}
        };

        int target = 34;
        // format to return the value {row, col}
        int [] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));


    }




    // Maximum in 2D Array
    static int max(int[][] arr){

        int max = arr[0][0];
//        int max = Integer.MIN_VALUE;

        // iteration using for loop
        for(int i = 0; i<arr.length; i++){
            for(int j= 0; j<arr[i].length;j++){

                if(arr[i][j] > max){
                   max = arr[i][j];
                }
            }
        }

        return max;
    }







    // return row an dcoloum of the targeted element
    static int[] search(int[][] arr, int target){
        // iteration using for loop

        for(int i = 0; i<arr.length; i++){
            for(int j= 0; j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int [] {i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }
}
