package DSA.Sorting.Bubble;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {

        //worst case
        int [] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

       // best case
        int [] nums={1,2,3,4,5};
        bubble(nums);
        System.out.println(Arrays.toString(nums));



    }


    static void bubble(int[] arr){

        boolean swapped;
        //run the steps for n-1 times
        for (int i = 0; i < arr.length; i++) {

            swapped = true;
            // for each step , max item will come at the last respective index
            for(int j =1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j] <arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }

            }

            //if you did not swap for a particular valueof i, it means the array is sorted hence the program is stopped
            if(!swapped){ //!false = true
                break;

            }

        }
    }

}
