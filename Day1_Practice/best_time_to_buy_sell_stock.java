package Day1_Practice;

public class best_time_to_buy_sell_stock {
    class Solution {
        public int maxProfit(int[] price) {
            if (price.length < 2) {
                return 0;
            }

            int minPrice = price[0];
            int maxProfit = 0;

            for (int i = 1; i < price.length; i++) {
                if (price[i]<minPrice) {
                    minPrice = price[i];
                } else if (price[i]-minPrice > maxProfit) {
                    maxProfit = price[i]-minPrice;
                }
            }
            return maxProfit;
        }
    }
}
