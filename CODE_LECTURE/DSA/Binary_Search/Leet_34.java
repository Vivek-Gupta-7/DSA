package DSA.Binary_Search;

import java.util.Arrays;

public class Leet_34 {
    public static void main(String[] args) {

        int[] nums = {5,7,7,7,8,8,10};
        int target = 7;

        int[] sol = searchRange(nums, target);
        System.out.println(Arrays.toString(sol));



    }


    public static int[] searchRange(int[] nums, int target){


        int[] ans ={-1,-1};

        // check for the first occurrence if target first
        int start = search(nums,target,  true);
        int end = search(nums,target,  false);

        ans[0] = start;
        ans[1] = end;
        return ans;

    }



    // this function just returns the index value of target
   static int search(int[] nums, int target, boolean findStartIndex ){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            // find the middle element

//            int mid = (start+end)/2; // might be possible that (start + end) exceed the range of integer

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            }

            else if (target > nums[mid]) {

                start = mid + 1;
            }

            else {
                //potential ans found
                ans= mid;
                if(findStartIndex == true){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
