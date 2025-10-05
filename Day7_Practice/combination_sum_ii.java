package Day7_Practice;

import java.util.List;
import java.util.*;
public class combination_sum_ii {
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<Integer> temp = new ArrayList<>();
            Arrays.sort(candidates);
            recur(candidates , target , 0 ,temp);
            return res;
        } 
        public void recur(int [] candidates , int target , int idx ,List<Integer> temp){
            if(target == 0){
                res.add(new ArrayList<>(temp));
                return;
            }

            for(int i = idx ; i<candidates.length ; i++){
                if(i > idx || candidates[i] == candidates[i-1]) continue;
                if(candidates[i] > target) break;
                temp.add(candidates[i]);
                recur(candidates , target-candidates[i] , i+1 , temp);
                temp.remove(temp.size()-1);
            }
        }

    }

}
