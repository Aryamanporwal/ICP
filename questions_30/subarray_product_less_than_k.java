package questions_30;

public class subarray_product_less_than_k {
    class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int start = 0;
        int n = nums.length;
        int sum = 1;
        int c = 0;
        for(int end = 0; end<n ; end++){
            sum*= nums[end];
            while(end>=start && sum>=k){
                sum/=nums[start];
                start++;
            }
            c+= (end-start)+1;
        }
        return c;
    }
}
}
