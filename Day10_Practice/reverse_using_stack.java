package Day10_Practice;

import java.util.Stack;

public class reverse_using_stack {
    class Solution {
        public String reverse(String S) {
            // code here
            Stack<Character> st = new Stack<>();
            for(char ch : S.toCharArray()){
                st.push(ch);
            }
            String rev = "";
            while(!st.isEmpty()){
                rev += st.pop();
            }
            return rev;
        }
    }
}
