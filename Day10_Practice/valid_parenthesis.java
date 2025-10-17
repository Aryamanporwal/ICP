package Day10_Practice;

import java.util.Stack;

public class valid_parenthesis {
    class Solution {
        public boolean isValid(String s) {
            int len = s.length();
            if(len%2!=0){
                return false;
            }
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i<len ; i++){
                char ch = s.charAt(i);
                if(s.charAt(i)=='('||s.charAt(i)=='{'|| s.charAt(i)=='['){
                    stack.push(ch);
                }
                else{
                    if(stack.isEmpty()){
                        return false;
                    }
                    char top = stack.peek();
                    if(ch==')' && top!='('){
                        return false;
                    }
                    else if(ch=='}' && top!='{'){
                        return false;
                    }
                    else if(ch==']' && top!='['){
                        return false;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            return (stack.size()==0);
        }
    }
}
