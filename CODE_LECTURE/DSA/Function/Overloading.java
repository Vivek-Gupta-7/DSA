package DSA.Function;

public class Overloading {
    public static void main(String[] args) {
        fun(129);
        fun("Vivek Gupta");
        int sum = fun(79,129);
        System.out.println(sum);
    }

    static int fun(int a,int b){
        return a +b;

    }

    static int fun(int a,int b, int c){
        return a +b+c;

    }



    static void fun(int a){
        System.out.println(a);

    }

    static void fun(String name){
        System.out.println(name);

    }
}
