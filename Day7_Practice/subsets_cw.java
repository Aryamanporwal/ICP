package Day7_Practice;

import java.util.*;
public class subsets_cw{
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        public List<List<Integer>> subsets(int[] nums) {
            List<Integer> temp = new ArrayList<>();
            recur(nums, 0 , temp);
            return res;
        }
        public void recur(int []nums , int idx , List<Integer> temp ){
            res.add(new ArrayList<>(temp));
            

            for(int i = idx ; i<nums.length ; i++){
                temp.add(nums[i]);
                recur(nums , i+1 , temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}