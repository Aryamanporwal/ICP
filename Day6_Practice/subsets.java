package Day6_Practice;
import java.util.*;
public class subsets{
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        public List<List<Integer>> subsets(int[] nums) {
            List<Integer> temp = new ArrayList<>();
            recur(nums, 0 , temp);
            return res;
        }
        public void recur(int []nums , int idx , List<Integer> temp ){
            if(idx >= nums.length) {
                res.add(new ArrayList<>(temp));
                return;
            }

            temp.add(nums[idx]);
            recur(nums , idx+1, temp);
            temp.remove(temp.size()-1);
            recur(nums, idx+1 , temp);
        }
    }
}