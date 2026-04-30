package Conditional;

public class if_else {
    public static void main(String[] args) {

        /*
        syntax of if statement:
        if(boolean expression T or F){
        //body
        }
        else{
        //do this
        }
         */

        int salary = 24000;
//        if(salary>100000){
//            salary = salary + 10000;
//
//        }else{
//            salary+=100;
//        }
//        System.out.println(salary);


//        MULTIPLE IF ELSE STATEMENT
        if(salary>10000){
            salary+=2000;

        }
        else if(salary>30000){
            salary+=3000;
        }
        else{
            System.out.println("Salary Increase karo");
        }
        System.out.println(salary);

    }
}
