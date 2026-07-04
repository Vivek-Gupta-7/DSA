package DSA.Arrays;

public class Best_time_to_buy_sell_stock_leet_121 {
    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

    }

    static int maxProfit(int[] prices) {

        int sell=0;
        int buy=0;
        for(int i=0;i<prices.length;i++){
            int min = prices[0];
            if(prices[i]<min){
                min=prices[i];
                buy=prices[min];
            }

            for(int j=min;j<prices.length;j++){
                int max = prices[min];
                if(max<prices[j]){
                    max=prices[j];
                    sell = max;


                }
            }

            return sell-buy;


        }


        return 0;





    }
}
