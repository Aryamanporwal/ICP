package Day8_Practice;

import java.util.Arrays;

public class climbing_stairs {
    class Solution {
        public int climbStairs(int n) {
            int noOfways[] = new int[n+1];
            Arrays.fill(noOfways,-1);
            return possWays(0 , n , noOfways);

        }
        public int possWays(int currVal , int tar , int []dp){
            if(currVal == tar) return 1;
            if(currVal > tar) return 0;
            if(dp[currVal] != -1) return dp[currVal];

            int so = possWays(currVal+ 1 , tar , dp);
            int si = possWays(currVal+2 , tar , dp);
            dp[currVal] = so+si;
            return dp[currVal];
        }
    }
}
