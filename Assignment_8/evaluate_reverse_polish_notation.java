package Assignment_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

public class evaluate_reverse_polish_notation {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> st = new Stack<>();
            Map<String, BiFunction<Integer , Integer , Integer>> ops = new HashMap<>();
            ops.put("+" , (a,b)->a+b);
            ops.put("-" , (a,b)->a-b);
            ops.put("*" , (a,b)->a*b);
            ops.put("/" , (a,b)->a/b);

            for(int i = 0; i<tokens.length ; i++){
                String s = tokens[i];
                if(s.matches("-?\\d+")){
                    st.push(Integer.parseInt(s));
                }
                if((st.size() >= 2) && (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))){
                    int a = st.pop();
                    int b = st.pop();
                    int result = ops.get(s).apply(b,a);
                    st.push(result);
                }
            }
            return st.pop();
        }
    }
}
