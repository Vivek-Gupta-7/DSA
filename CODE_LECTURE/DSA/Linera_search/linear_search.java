package DSA.Linera_search;

public class linear_search {
    public static void main(String[] args) {

        int[] nums ={ 1,56,79,129,-54,-57,8,10,16,8};
        int target = 129;
        int ans = linearSearch(nums,target);
        System.out.println(ans);


        int ans2 = linearSearch2(nums,target);
        System.out.println(ans2);


        boolean ans3 = linearSearch3(nums,target);
        System.out.println(ans3);



    }






//    SEARCH THE TARGET AND RETURN TRUE OR FLASE

    static Boolean linearSearch3(int[] arr, int target){

        if (arr.length == 0){
            return false;
        }


        // run a for loop
        for(int i =0 ; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return true;
            }

        }
        // this line will execute if none of the return statement
        // above have executed
        // hence the target not found

        return false;

    }







//    search the target and return the element
static int linearSearch2(int[] arr, int target){

    if (arr.length == 0){
        return -1;
    }


    // run a for loop
    for (int element : arr) {
        if (element == target) {
            return element;
        }

    }
    // this line will execute if none of the return statement
    // above have executed
    // hence the target not found

    // agar return mai -1 print karaya toh humko kaise pata lagega ki -1 element hain ye not found hain toh -1 hain uske jagha kuch aur print karte hain
    return Integer.MAX_VALUE;

}


//    search iin the array: return the index if the item found
//    otherwise if item is not found return -1
    static int linearSearch(int[] arr, int target){

        if (arr.length == 0){
            return -1;
        }


        // run a for loop
        for(int i =0 ; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }

        }
        // this line will execute if none of the return statement
        // above have executed
        // hence the target not found

        return -1;

    }


}
