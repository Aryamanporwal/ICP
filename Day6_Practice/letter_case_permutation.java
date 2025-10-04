package Day6_Practice;

import java.util.*;

public class letter_case_permutation {
    class Solution {
        List<String> res = new ArrayList<>();
        public List<String> letterCasePermutation(String s) {
            recur(0 , s.toCharArray());
            return res;
        }

        public void recur(int idx , char[] s){
            if(idx == s.length){
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i<s.length ; i++){
                    sb.append(s[i]);
                }
                res.add(sb.toString());
                return;
            }

            char ch = s[idx];
            
            if(Character.isDigit(ch)){
                recur(idx+1 , s);
                return;
            }

            recur(idx+1 , s);

            if(Character.isLowerCase(ch)){
                s[idx] = Character.toUpperCase(ch);
            }else{
                s[idx] = Character.toLowerCase(ch);
            }

            s[idx] = ch;
        }
    }

}
