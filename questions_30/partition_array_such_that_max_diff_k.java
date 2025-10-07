package questions_30;
import java.util.*;
public class partition_array_such_that_max_diff_k {
    class Solution {
        public int partitionArray(int[] nums, int k) {
            Arrays.sort(nums);
            int ans = 1;
            int r = nums[0];
            for(int i = 0; i<nums.length ; i++){
                if(nums[i]-r>k) {
                    ans++;
                    r = nums[i];
                }
            }
            return ans;
        }
    }
}
