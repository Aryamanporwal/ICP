package Day7_Practice;

import java.util.ArrayList;

public class combination_sum {
    class Solution {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
            // code here
            ArrayList<Integer> temp = new ArrayList<>();
            recur(arr , target , 0 , temp);
            return res;
        }
        
        public void recur(int [] arr , int target , int idx , ArrayList<Integer> temp){
            
            if(target == 0){
                res.add(new ArrayList<>(temp));
                return;
            }
            
            if(idx >= arr.length || target<0 ){
                return;
            }
            
            
            temp.add(arr[idx]);
            recur(arr , target-arr[idx] , idx , temp);
            temp.remove(temp.size()-1);
            
            recur(arr , target , idx+1 , temp);
        }
    }
}
