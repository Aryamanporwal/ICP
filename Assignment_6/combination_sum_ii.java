package Assignment_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum_ii {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            ArrayList<Integer> ll = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            combi(candidates , target , ll , ans , 0);
            return ans;
        }
        public  void combi(int []coin ,int target, ArrayList<Integer> ll , List<List<Integer>> ans , int idx){
            if(target == 0){
                
                ans.add(new ArrayList<>(ll));
                return ;
            }
            for(int i = idx ; i<coin.length ; i++){
                if (i > idx && coin[i] == coin[i - 1]) continue;
                if(target>=coin[i]){
                    ll.add(coin[i]);
                    combi(coin, target-coin[i] , ll , ans , i+1);
                    ll.remove(ll.size()-1);
                }
            }
        }
        
    }

}
