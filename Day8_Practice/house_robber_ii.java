package Day8_Practice;

import java.util.Arrays;

public class house_robber_ii {
    class Solution{
        public int rob(int[] nums) {
            int n = nums.length;
            if(n==1) return nums[0];
            int dp[] = new int[n];
            int dp1 [] = new int[n+1];
            Arrays.fill(dp , -1);
            Arrays.fill(dp1 , -1);
            return Math.max(recur(nums, 0 , n-2, dp) , recur(nums ,1,n-1, dp1));
        }
        public int recur(int [] nums , int idx, int last , int dp[] ){
            if(idx > last) return 0;
            if (dp[idx]!= -1) return dp[idx];

            int pick = nums[idx] + recur(nums , idx+2, last , dp);
            int nopick = 0+ recur(nums, idx+1,last , dp);
            dp[idx] = Math.max(pick , nopick);
            return dp[idx];
        }
    }
}
