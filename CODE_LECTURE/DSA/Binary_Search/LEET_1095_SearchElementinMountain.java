package DSA.Binary_Search;

public class LEET_1095_SearchElementinMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2};

        int target = 5;

        int sol =search(arr,target);
        System.out.println(sol);

    }


   static  int search (int[] arr, int target){
        int peak = peakIndexMountainArray((arr));
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }

        // otherwise try to search in second half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }




    static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }


    static int orderAgnosticBS(int[] arr, int target,int start,int end){

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
