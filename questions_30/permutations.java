package questions_30;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {
            recur(nums , 0);
            return res;
        }
        public void recur(int nums[] , int idx){
            if(idx == nums.length){
                List<Integer> temp = new ArrayList<>();
                for(int n : nums){
                    temp.add(n);
                }
                res.add(temp);
                return;
            }

            for(int i = idx ; i<nums.length ; i++){
                swap(nums,idx,i);
                recur(nums,idx+1);
                swap(nums,idx,i);
            }
        }

        public void swap(int []nums , int i , int j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
