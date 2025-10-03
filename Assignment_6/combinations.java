package Assignment_6;

import java.util.ArrayList;
import java.util.List;

public class combinations {
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            ArrayList<Integer> ll = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            combi(1 , k ,n, ll , ans);
            return ans;
        }
        private void combi(int arr , int k, int n , ArrayList<Integer> ll , List<List<Integer>> ans ){
            if(ll.size()==k){
                ans.add(new ArrayList<>(ll));
                return;
            }
            for(int i = arr ; i<=n ; i++){
                ll.add(i);
                combi(i+1 , k , n , ll , ans);
                ll.remove(ll.size()-1);
            }
            
        }
    }
}
