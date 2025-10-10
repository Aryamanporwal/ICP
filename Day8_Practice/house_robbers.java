package Day8_Practice;

    public class house_robbers {
        class Solution {

        // recursion
        // public int rob(int[] nums) {
        //     int n = nums.lemgth;
        //     return recur(nums , n-1);
        // }
        // public int recur(int nums[] , int idx){
        //     //base case 
        //     if(idx==0) return nums[0];
        //     if(idx == -1) return 0;

        //     //pick and no pick
        //     int pick = nums[idx] + recur(nums , idx-2);
        //     int nopick = 0 + recur(nums, idx-1);

        //     return Math.max(pick , nopick)
        // }

        // top-down dp
        // public int rob(int[] nums) {
        //     int n = nums.lemgth;
        //     int dp[] = new int[n+1];
        //     Arrays.fill(dp , -1);
        //     return recur(nums , n , dp);
        // }
        // public int recur(int nums[] , int idx, int [] dp){
        //     //base case 
        //     if(idx==1) {
        //         dp[idx] = nums[0];
        //         return nums[0];
        //         }
        //     if(idx == 0){
        //         dp[idx] = 0;
        //         return 0;   
        //     }

        //     if(dp[idx]!=-1){
        //         return dp[idx];
        //     }

        //     //dp k sath idx and nums k sath idx-1
        //     //pick and no pick
        //     int pick = nums[idx-1] + recur(nums , idx-2 , dp);
        //     int nopick = 0 + recur(nums, idx-1 , dp);
        //     dp[idx] = Math.max(pick , nopick);
        //     return Math.max(pick , nopick)
        // }

            // bottom-up 
        public int rob(int[] nums) {
            int n = nums.length;
            int dp[] = new int[n+1];
            dp[0] = 0;
            dp[1] = nums[0];
            for(int state =2 ; state<n+1 ; state++){
                int pick = nums[state-1] + dp[state-2];
                int nopick = 0 + dp[state-1];
                dp[state] = Math.max(pick , nopick);
            }
            return dp[n];
        }
    }
}
