package Day8_Practice;

import java.util.Arrays;

public class min_cost_climbing_stairs {
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int dp[] = new int[cost.length];
            Arrays.fill(dp , -1);
            return Math.min(minCost(cost , 0 , dp) , minCost(cost , 1, dp)); 
        }
        public int minCost(int []cost , int idx , int[]dp){
            //base case
            if(idx >= cost.length) return 0;
            if(dp[idx] != -1) return dp[idx];
            int so = minCost(cost ,  idx+1 , dp);
            int si = minCost(cost ,  idx+2 , dp);
            dp[idx] = cost[idx]+Math.min(so , si);
            return dp[idx];  
        }
    }
}
