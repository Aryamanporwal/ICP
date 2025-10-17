package Day10_Practice;

import java.util.Stack;

public class implement_queue_using_stack {
    class MyQueue {
        Stack<Integer> st = new Stack<>();
        public MyQueue() {
        }
        
        public void push(int x) {
            st.push(x);
        }
        
        public int pop() {
            Stack<Integer> temp = new Stack<>();
            while(st.size()>1){
                temp.push(st.pop());
            }
            int ele = st.pop();
            while(!temp.isEmpty()){
                st.push(temp.pop());
            }
            return ele;

        }
        
        public int peek() {
            return st.get(0);
        }
        
        public boolean empty() {    
            if(st.isEmpty()){
                return true;
            }
            return false;
        }
    }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
}
