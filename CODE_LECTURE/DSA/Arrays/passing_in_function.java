package DSA.Arrays;

import java.util.Arrays;

public class passing_in_function {
    public static void main(String[] args) {
        int[] ar = {10,5,7,22,8};
        System.out.println(Arrays.toString(ar));
        change(ar);
        System.out.println(Arrays.toString(ar));

    }

    static void change(int[] arr){
        arr[0]=129;
    }
}
