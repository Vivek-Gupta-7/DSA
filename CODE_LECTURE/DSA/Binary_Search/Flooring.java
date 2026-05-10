package DSA.Binary_Search;

public class Flooring {
    public static void main(String[] args) {


        int [] nums = {2,3,5,9,14,16,18};
        int target = 4 ;
        int ans = floor(nums,target);
        System.out.println(ans);

    }
// return index : greates number smaller than or equal to target
    static  int floor(int [] arr, int target){



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
        return end;
    }
}
