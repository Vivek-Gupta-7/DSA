package DSA.Binary_Search;

public class Rotated_BS {
    public static void main(String[] args) {
        // notes in copy

        int [] arr = {4,5,6,7,0,1,2};

        System.out.println(findPivot(arr));



    }



    // will not work for duplicate values
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





        }
        return -1;

    }

}
