package Day1_Practice;

public class first_missing_positive {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int n = nums.length;
            for(int i = 0; i<nums.length ; i++){
                if(nums[i]<=0 || nums[i]>n){
                    nums[i] = n+1;
                }
            }

            for(int i = 0; i<n ; i++){
                int val = Math.abs(nums[i]);
                if(val>0 && val<=n){
                    int idx = val-1;
                    if(nums[idx]>0){
                        nums[idx] = -nums[idx];
                    }
                }
            }

            for(int i = 0; i<n ; i++){
                if(nums[i] >0 ){
                    return i+1;
                }
            }
            return n+1;
        }
    }
}
