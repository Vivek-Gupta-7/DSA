package Linera_search;

public class Search_in_Range {
    public static void main(String[] args) {
        int [] nums ={23,56,89,395,75,-3,84,-5,5,-9,100};
        int target = 84;
        int start = 3;
        int end = 7;
        int ans = SearchInRange(nums,target,start,end);
        System.out.println(ans);

    }

    static int SearchInRange(int [] arr, int target,int start,int end){
        if(arr.length ==0){
            return -1;
        }

        for(int i = start; i<=end ; i++){
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

        // this lin ewilll be execute if none of the return statement will be executed
        //hence the target not found
        return -1;
    }
}
