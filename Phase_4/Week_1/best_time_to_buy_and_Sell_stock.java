package Phase_4.Week_1;
import java.util.*;
public class best_time_to_buy_and_Sell_stock {
    public static void main(String[] args) {
        // You are given an integer array prices where prices[i] is the price of a given stock on the i-th day. You want to  maximize your profit by choosing one day to buy one stock and a later day to sell that stock. Return the  maximum profit you can achieve from this single transaction. If it’s not possible to make any profit (all prices  fall), return 0. 

        // Example: 
            // Input: prices = [7, 1, 5, 3, 6, 4] 
            // Output: 5 
            // Explanation: 
            // Buy on day 2 (price = 1) 
            // Sell on day 5 (price = 6) 
            // Profit = 6 - 1 = 5 
            // Input: prices = [7, 6, 4, 3, 1] 
            // Output: 0 
            // Explanation: 
            // Prices only decrease, so no profit is possible. 
            // Input Format  
            // • An integer array prices of length n. 
            // • Each element prices[i] represents the stock price on day i. 
            // Output Format 
            // • Return a single integer representing the maximum possible profit. 
            // Constraints 
            // 1 ≤ prices.length ≤ 10^5 
            // 0 ≤ prices[i] ≤ 10^4 

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] prices = new int[n];
            for(int i = 0 ; i<n ; i++){
                prices[i] = sc.nextInt();
            }

            sc.close();


    }

    public int solve(int [] prices){
        int n = prices.length;
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1 ; i<n ; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}
