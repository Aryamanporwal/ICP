package questions_30;

import java.util.Arrays;

public class minimize_maximum_pair_sum {
    class Solution {
        public int minPairSum(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i<n/2 ; i++){
                int sum = nums[i] +nums[n-i-1];
                max = Math.max(max , sum);
            }
            return max;
        }
    }
}
