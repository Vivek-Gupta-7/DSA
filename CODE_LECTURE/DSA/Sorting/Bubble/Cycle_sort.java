package DSA.Sorting.Bubble;

import java.util.Arrays;

public class Cycle_sort {
    public static void main(String[] args) {
        int[] nums ={3,5,2,1,4};
        sort(nums);
        System.out.println(Arrays.toString(nums));


    }

    static void sort(int [] arr){
        int i =0;
        while(i<arr.length-1) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int [] arr, int first,int second){
        int temp=arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
