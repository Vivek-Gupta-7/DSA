package DSA.Sorting.Bubble;

import java.lang.module.FindException;
import java.util.Arrays;

public class cycle_sort_missing_number_leet_268 {
    public static void main(String[] args) {
        int[] arr={4,0,1,2};
        int missing = sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missing);

    }

        static int sort(int [] arr){
            int i =0;
            while(i<arr.length) {
                // number 0 to n hain so yaha correct index value ke equal hoga so -1 karne ka jarurant nahi hain
                int correctIndex = arr[i];
                if(arr[i]<arr.length && arr[i] != arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }
                else{
                    i++;
                }
            }
            //search for first missing number
            for (int index = 0; index <arr.length ; index++) {
                if(arr[index] != index) {
                    return index;
                }
                
            }

            //case 2
            return arr.length;



        }

        static void swap(int [] arr, int first,int second){
            int temp=arr[first];
            arr[first]= arr[second];
            arr[second] = temp;
        }
}


