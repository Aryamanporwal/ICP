package Day2_Practice;
import java.util.*;
public class maximum_product_three_numbers {
    class Solution {
        public int maximumProduct(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            int prod1 = nums[n-1] * nums[n-2] * nums[n-3];
            int prod2 = nums[0] * nums[1] * nums[n-1];
            return Math.max(prod1, prod2);
        }
    }

}
