package DSA.Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,7};
        System.out.println(MaxRange(arr,1,2));
    }
    // work on edge cases here, like array being null
    private static int MaxRange(int[] arr, int start, int end) {

        if(end>start){
            return -1;
        }

        if(arr== null){
            return -1;
        }

        int maxval=arr[start];
        for(int i = start ; i <=end;i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }


    // simply finding the max element
    static int max(int[] arr){
        if(arr.length ==0){
            return -1;
        }

        int maxval = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]> maxval){
                maxval = arr[i];
            }
        }

        return maxval;
    }
}
