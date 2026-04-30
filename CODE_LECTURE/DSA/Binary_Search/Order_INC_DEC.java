package DSA.Binary_Search;

public class Order_INC_DEC {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7};//increasing order
        int [] nums = {7,6,5,4,3,2,1};
        int target = 5;
        int ans = orderAgnosticBS(nums,target);
        System.out.println(ans);

    }




    static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;


        //find whether the array is sorted in increasing or decreasing order
        // we can write the below code also as "boolean isAsc = arr[start]<arr[end];"

        boolean isAsc;

        if(arr[start]<arr[end]) {
            isAsc = true;
        }
        else {
            isAsc = false;
        }

        while(start <= end) {
            // find the middle element

//            int mid = (start+end)/2; // might be possible that (start + end) exceed the range of integer

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }


            if (isAsc) {
                if (target > arr[mid]) {

                    start = mid + 1;
                } else if (target < arr[mid]) {

                    end = mid - 1;
                }

            } else {
                if (target < arr[mid]) {

                    start = mid + 1;
                } else if (target > arr[mid]) {

                    end = mid - 1;
                }
            }
        }



        //ans not found
        return -1;



    }
}
