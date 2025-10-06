package questions_30;

import java.util.Arrays;

public class three_sum_closest {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int len = nums.length;
            int diff = Integer.MAX_VALUE;
            Arrays.sort(nums);
            int ans = 0;
            //fix one element and check remaining elements by two pointers approach   
            for(int i = 0 ;i<len ; i++){
                int first = nums[i];
                int start = i+1;
                int end = len-1;
                while(start<end){
                    if((first+nums[start]+nums[end])==target) return target;
                    else if(Math.abs(first+nums[start]+nums[end]-target)<diff){
                        diff = Math.abs(first+nums[start]+nums[end]-target);
                        ans = first+nums[start]+nums[end];
                    }
                    if((first+nums[start]+nums[end])> target) end--;
                    else start++;
                }
            }  
            return ans;   
        }
    }
}
