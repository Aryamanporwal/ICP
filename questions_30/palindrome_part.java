package questions_30;

import java.util.*;
public class palindrome_part{
    class Solution {
        List<List<String>> res = new ArrayList<List<String>>();
        public List<List<String>> partition(String s) {
            List<String> temp = new ArrayList<>();
            recur(temp , 0 , s);
            return res;
        }

        public void recur(List<String> temp , int start , String s){
            
            if(start == s.length()){
                res.add(new ArrayList<>(temp));
                return;
            }

            for(int end =start ; end< s.length() ; end++){
                if(isPalin(start , end , s)){
                    temp.add(s.substring(start , end+1));
                    recur(temp , end+1 , s);
                    temp.remove(temp.size()-1);
                }
            }
        }

        public boolean isPalin(int start , int end , String s){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            if(start>=end){
                return true;
            }

            return isPalin(start+1 , end-1 , s);
        }
    }
}
