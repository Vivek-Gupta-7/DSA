package DSA.Function;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,6,7,8);
        multiple(2,4,"vivek","priyanka");



    }

    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
