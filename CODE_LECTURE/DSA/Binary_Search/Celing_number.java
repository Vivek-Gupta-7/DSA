package DSA.Binary_Search;

public class Celing_number {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,9,14,16,18};
        int target = 6;
        int ans = solution(arr, target);
        System.out.println(ans);
    }


    static int solution(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                // find the middle element

//            int mid = (start+end)/2; // might be possible that (start + end) exceed the range of integer

                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {

                    start = mid + 1;
                } else {
                    //ans found
                    return mid;
                }
            }



    //ans not found
            return start;


    }

}
