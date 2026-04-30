package DSA.Binary_Search;

public class Binary_S {
    public static void main(String[] args) {

        int [] nums = {-18,-12,-6,-3,0,1,2,3,4,6,7,10,29,79,129,};
        int target = 7 ;
        int ans = binarySearch(nums,target);
        System.out.println(ans);




    }

    // return the index

    static  int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element

//            int mid = (start+end)/2; // might be possible that (start + end) exceed the range of integer

            int mid = start +(end-start)/2;

            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target >arr[mid]){

                start = mid + 1;
            }

            else{
                //ans found
                return mid;
            }
        }
        //ans not found
        return -1;
    }
}
