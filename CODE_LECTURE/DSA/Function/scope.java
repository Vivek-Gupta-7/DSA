package DSA.Function;

public class scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        {
            // block scope
//           int   a = 78;// already initialized outside the block  in the same method so it cannot be initialized again
            a = 79;// reassign the origin reference variable to some other value

             int c =99;

             // value initialized in this block will remain in this block
        }
//        System.out.println(c);
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
