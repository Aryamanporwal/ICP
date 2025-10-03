
import java.util.Arrays;

public class two_chocolates {
    class Solution {
        public int buyChoco(int[] prices, int money) {
            Arrays.sort(prices);
            return money - (prices[1]+prices[0]) >=0 ? money - (prices[1]+prices[0]) : money;
        }
}
}
