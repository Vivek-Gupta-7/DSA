package Linera_search;

public class Leet1295_find_no_with_even_digit {
    public static void main(String[] args) {
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
        // question 1295 Find Numbers with even number of digits
        // nums = [12,345,1,3,7869]
        // output = 2 (12,7869)


        int[] nums={12,245,2,6,7869};
        System.out.println(findNumbers(nums));

        System.out.println(digit2(249743));

    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0, numsLength = nums.length; i < numsLength; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }


        return count;
    }


    // function to check whether a number contains even digit or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
//        if(numberOfDigits % 2 ==0){
//            return true;
//        }
//        return false;
        return numberOfDigits % 2 ==0;

    }



    // count number of digits in a number
    static int digits(int num){

        // FOR NEGATIVE NUMBER
        if(num<0){
            num = num*-1;
        }

        if(num ==0){
            return 1;
        }
        int count =0;

        while (num>0){
            count++;
            num = num/10;
        }
        return count;

    }

    // optimized code to find digit
    static int digit2(int num){
        if(num<0){
            num = num*-1;
        }

        return (int)(Math.log10(num))+1;
    }
}
