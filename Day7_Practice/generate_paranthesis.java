package Day7_Practice;

import java.util.*;
public class generate_paranthesis {
    class Solution {
        List<String> res= new ArrayList<>();
        public List<String> generateParenthesis(int n) {
            String temp = "";
            recur(0 , 0 , temp , n);
            return res;
        }

        public void recur(int oc , int cc , String temp , int n){
            if(oc == n && cc == n){
                res.add(temp);
                return;
            }

            if(oc<n){
                recur(oc+1 , cc , temp+"(" , n);
            }

            if(cc<n && cc<oc){
                recur(oc , cc+1 , temp+")" , n);
            }
        }
    }
}
