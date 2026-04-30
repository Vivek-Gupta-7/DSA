package DSA.Conditional;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID =in.nextInt();
        String department =in.next();

        switch (empID){
            case 1:
                System.out.println("Vivek Gupta");
                break;
            case 2:
                System.out.println("Priyanka Saikia");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department");

                }
                break;

            default:
                System.out.println("Enter the correct EmpId");
        }
    }
}
