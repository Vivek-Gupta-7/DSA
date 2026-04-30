package Linera_search;

public class FindMin {
    public static void main(String[] args) {
        int [] nums ={23,56,89,395,75,-3,84,-5,5,-9,100};
        System.out.println(Min(nums));
    }

    static int Min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i<arr.length; i++){
            if(arr[i]<ans){
                ans= arr[i];
            }

        }
        return ans;
    }
}
