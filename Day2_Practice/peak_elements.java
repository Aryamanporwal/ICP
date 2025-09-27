package Day2_Practice;

public class peak_elements {
    class Solution {
        public int findPeakElement(int[] nums) {
            int len = nums.length;
            for(int i= 0 ; i<len-1 ; i++){
                if(nums[i]>nums[i+1]){
                    return i;
                }
            }
            return len-1;
        }
    }
}
