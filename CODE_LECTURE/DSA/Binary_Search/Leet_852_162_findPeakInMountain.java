package DSA.Binary_Search;

public class Leet_852_162_findPeakInMountain {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,4,3,2};

        int sol = peakIndexMountainArray(arr);
        System.out.println(sol);


    }

   static int peakIndexMountainArray(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // we are in descending part of array
                // this may be the ans, but look on the left hand side
                // this is why end!= mid -1

                end = mid;
            }

            else{
                //we are in ascending part of the array
                //look on the right hand side

                start= mid+1;// because we know that mid +1 element > mid element
            }
            // in the ned , start = end and pointing to the largest elment of the array
            // start and end are always trying to find max element in the above two checks
            // since when they are pointing to just one element , that is the max one because that is what the checks say
            //more elaboration: at every  point of time for start and end , they have the best possible answer till that time
            //and if we are saying that only one item is remaining , hence becaus eof the above line that is the best possible ans


        }
       return start;//or end as both are equal

    }
}
