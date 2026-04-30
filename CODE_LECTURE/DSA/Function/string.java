package DSA.Function;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        System.out.println(greet());

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println(mygreet(name));

    }

    static String mygreet(String name) {
        String message = "hello " + name;
        return message;
    }

    static String greet() {

        String value = "I am Optimistic";
        return value;
    }

}
