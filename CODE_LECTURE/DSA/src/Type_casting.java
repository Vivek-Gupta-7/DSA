import java.util.Scanner;

public class Type_casting {
    public static void main(String[] args) {

        // automatic type conversion- converting one small similar datatype to another big datatype like Int nand Float
//        Scanner input =  new Scanner(System.in);
//        System.out.println("Enter the number:");
//        float num = input.nextFloat();
//        System.out.println(num);

        // type casting - Converting a bigger datatype into a smaller datatype explicitly
        int num = (int)(79.1000f);
        System.out.println(num);



//       // automatic type promotion in expressions
//        int a = 128;// 128-256 tak ka value lenge toh promote hone ke baad value -128 se -1 tak jayega
//        byte b = (byte)(a);// 257% 256 = 1(isliya aaya kyuki byte ka range 256 tak hi hain use jayda store nahi kar payega so 256 se divide karne jo reminder aayrga wo store kardega)
//        System.out.println(b);




//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c; // yaha 'a' and 'b' dono byte hain and unka product ka value 2000 hoga jo possible hi nahi hain ki byte pe store kare . yaha automatic etype promotion ho raha hain a and b dono ko integer mai promote karne ke baad multiply hua hain
//        System.out.println(d);


        // yaha bhi b mai 100 save nahi hoga as int mai promote karne ke baad hi product hoga
//         byte b = 50;
//         b = b*2;


//        int number = 'A';// a= 97 and A=65
//        System.out.println(number);



//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = 0.1234;
//        double result = (f*b) + (i/c) - (d*s);
//        System.out.println((f*b)+ " " + (i/c)  + " " +  (d*s)); //  ye  float + integer - double (yaha double sabse bada hain so result double mai ayyega)
//        System.out.println(result);// whole result double mai aayega type promotion


//        int count = 1;
//        while (count != 5) {
//            System.out.println(count);
//            count++;


//        }
        // for loop
        for (int count= 1 ; count != 5 ; count++){
            System.out.println(count);
        }









    }
}
