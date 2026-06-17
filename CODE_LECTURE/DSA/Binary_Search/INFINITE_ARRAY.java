package DSA.Binary_Search;

public class INFINITE_ARRAY {
    public static void main(String[] args) {
//     question: find the position of an element in a sorted array of infinite size

    int [] arr = {3,5,7,9,10,90,100,130,140,160,170};
    int target = 10;
        System.out.println(ans(arr,target));




    }

    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2

        // box ka size 2 hain so start ka value "0" and end ka value "1" hoga siez increase hone se start and end ka value chaneg hoga

        int start = 0;
        int end = 1;

        // condition for the target to lie in the range

//        ye condition pe humlogo ne check kiya, jo chunk liya hain usme end ka value target se chota hain toh chunk ka size increase karna hain

        while(target> arr[end]){
            int newStart = end + 1;// ye new start hain name isliya change kiya hain kyuki end ka value define karne  ke liya pura start ka value waha chaiye tha
            // double the box value
//            end = previous end +sizeofbox*2
            end = end + (end - start + 1)*2;
            start = newStart;

        }
        return binarySearch(arr,target,start,end);

    }


    static  int binarySearch(int [] arr, int target, int start, int end){

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
