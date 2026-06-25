package DSA.Binary_Search;

public class Split_Array_Largest_sum_leet_410 {
    public static void main(String[] args) {

        int[] arr = {7, 2, 5, 10,8};
        int m = 2;
        int sol = splitArray(arr,m);
        System.out.println(sol);
    }


    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);//in the end of the loop this will the max item of the array
            end += nums[i];
        }

        //binary search (as we have got start and end)
        while (start < end) {
            // try for the middle as potential ans

            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum

            int sum = 0;
            int pieces = 1;
            for (int num : nums) {

                if (sum + num > mid) {
                    //you cannot add this in this subarray, make new one
                    //say you add this num in new subarray , then sum = num

                    sum = num;
                    pieces++;

                } else {
                    sum += num;
                }
            }

                if (pieces > m) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            


        }
        return end;//here start == end

    }

}
