package DSA.Binary_Search;

public class Rotated_BS_pivot_with_duplicate_values {
    public static void main(String[] args) {

        int[] arr = {2,9,2,2,0};

        int sol = findPivot(arr);
        System.out.println(sol);

    }


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;

            //4 cases over here
            //case 1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;

            }

            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[mid] <=arr[start]){

                end = mid-1;

            }
            else{
                start = mid+1;
            }



            // if elements at middle , start,end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end])
            {
                //skip the duplicates
                //NOTE: if these elements at start and end were the pivot
                //check if start is pivot

                if (arr[start] > arr[start+1]) {
                    return start;

                }

                // agar pivot nahi hua toh ignore
                start++;


                // check whether end is pivot

                if(arr[end]>arr[end-1]){
                    return end-1;
                }

                // agar pivot nahi hua toh ignore
                end--;


            }


//            // left side is sorted, so pivot should be in right
//            else if(arr[start] < arr[mid] || (arr[start]== arr[mid] && arr[mid]>arr[end])){
//                start = mid +1;
//            }
//            else{
//                end = mid-1;
//            }




        }
        return -1;

    }

}
