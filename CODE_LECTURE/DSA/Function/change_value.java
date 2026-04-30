package DSA.Function;

import java.util.Arrays;

public class change_value {
    public static void main(String[] args) {
        // pass by value
        // changing the object using different variable pointing he same object
        // create an array

        int [] arr ={1,2,3,4,5,7};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
// nums is storing the copy of the vallue of the reference variable
    static void change(int[] nums){
        nums[0] = 99;// if you make a change to the object via this reference variable the main object will be changed


    }
}
