package Linera_search;

public class Leet1672Richest_Customer_wealth {

    public static void main(String[] args) {

        int [][] nums ={{1,2,3},{3,2,5}};

        int ans = maximumWealth(nums);
        System.out.println(ans);

    }

    public static int maximumWealth(int[][] accounts){
        // person = row
        // account = column
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person<accounts.length;person++){

            //when u start a new coloumn, take a new sum for that row
            int sum = 0;
            for(int account=0; account < accounts[person].length; account++){

                sum+= accounts[person][account];
            }


            //now we have sum of accounts of person

            // check with overall ans
            if(sum>ans){
                ans = sum;
            }



        }
        return ans;
    }
}
