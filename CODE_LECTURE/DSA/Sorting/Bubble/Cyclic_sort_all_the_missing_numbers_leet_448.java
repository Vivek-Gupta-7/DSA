package DSA.Sorting.Bubble;

import java.util.ArrayList;
import java.util.List;




class Cyclic_sort_all_the_missing_numbers_leet_448 {
    public List<Integer> findDisappearedNumber(int[] nums){
        int i =0;
        while(i<nums.length) {
            // number 0 to n hain so yaha correct index value ke equal hoga so -1 karne ka jarurant nahi hain
            int correctIndex = nums[i]-1;
            if ( nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }



   // just find missing
        List<Integer> ans= new ArrayList<>();
        for (int index = 0; index <nums.length ; index++) {
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;

    }

    static void swap(int [] arr, int first,int second){
        int temp=arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
