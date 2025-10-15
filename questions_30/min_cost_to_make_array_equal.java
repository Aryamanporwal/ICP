package questions_30;
import java.util.*;
public class min_cost_to_make_array_equal {
    class Solution {
    public long minCost(int[] nums, int[] cost) {
        long ans = Long.MAX_VALUE;
        int n = nums.length;
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            left = Math.min(left , nums[i]);
            right = Math.max(right , nums[i]);
        }

        while(left <= right){
            int mid = left + (right-left)/2;
            long cost1 = findCost(nums , cost , mid);
            long cost2 = findCost(nums , cost , mid+1);
            ans = Math.min(cost1 , cost2);

            if(cost2>cost1) { //right side , toh hmee left side jana chahiye
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return ans ==Integer.MAX_VALUE? 0 : ans;
    }

    public long findCost(int []nums, int []cost , int mid){
        long sum = 0;
        for(int i = 0; i<nums.length ; i++){
            sum+= ((long)Math.abs(nums[i]-mid)*(long)cost[i]);
        }
        return sum;
    }
}
    
}
