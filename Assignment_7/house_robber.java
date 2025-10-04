package Assignment_7;

import java.util.Arrays;

public class house_robber {
    class Solution {
        public int rob(int[] nums) {
            int n = nums.length;
            int dp[] = new int[n];
            Arrays.fill(dp , -1);
            return Math.max(recur(nums , 0, dp), recur(nums , 1, dp));
        }
        public int recur(int [] nums , int idx, int dp[]){
            if(idx >= nums.length){
                return 0;
            }

            if(dp[idx]!=-1) return dp[idx];

            int pick = nums[idx]+recur(nums , idx+2 , dp);
            int nopick = 0+recur(nums , idx+1 , dp);

            dp[idx] = Math.max(pick,nopick);
            return dp[idx];
        }
    }
}
