package DSA.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {

        // wrraper classes
        // anotised TC





        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(79);
//        list.add(129);
//        list.add(22);
//        list.add(7);
//        list.add(10);
//        list.add(19);
//        list.add(20);
//        list.add(24);
//        list.add(245);
//        list.add(69);
//        list.add(54565);
//        System.out.println(list);

        Scanner in = new Scanner(System.in);

        // contains
        System.out.println(list.contains(7));


        // set values
//        list.set(0,7);
        // remove element
//        list.remove(2);


        // input
        for(int i =0; i<5; i++){
            list.add(in.nextInt());
        }

//        System.out.println(list);


        // to get an item
        for(int i =0; i<5; i++){
            System.out.print(list.get(i)+" ");// pass index here, list[index] syntax wil not work here
        }









    }


}
