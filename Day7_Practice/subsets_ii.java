package Day7_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class subsets_ii {
    class Solution {
        HashSet<List<Integer>> set = new HashSet<>();
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            List<Integer> temp = new ArrayList<>();
            recur(nums, 0 , temp);
            return new ArrayList<>(set);
        }
        public void recur(int []nums , int idx , List<Integer> temp ){
            set.add(new ArrayList<>(temp));

            for(int i = idx ; i<nums.length ; i++){
                if(i == idx && nums[i] == nums[i-1]) continue;
                temp.add(nums[i]);
                recur(nums , i+1 , temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
