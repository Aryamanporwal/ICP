package Day10_Practice;

import java.util.Stack;

public class valid_stack_operations {
    class Solution {
        public boolean validateOp(int[] a, int[] b) {
            // code here
            int j = 0;
            int n = b.length;
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i<a.length; i++){
                st.push(a[i]);
                while(!st.isEmpty() && j<n && st.peek() == b[j]){
                st.pop();
                    j++;
                }
            }
            
            return (st.isEmpty())?true: false; 
        }
    }
}
