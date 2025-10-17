public class min_stack {
    class Pair{
        int val;
        int minVal;
        Pair(int v , int m){
            val = v;
            minVal = m;
        }
    }

    class MinStack {
        Stack<Pair> st = new Stack<>();
        public MinStack() {
            
        }
        
        public void push(int val) {
            if(st.isEmpty()){
                st.push(new Pair(val , val));
            }else{
                int min = Math.min(val , st.peek().minVal);
                st.push(new Pair(val , min)); 
            }
        }
        
        public void pop() {
            st.pop();
        }
        
        public int top() {
            return st.peek().val;
        }
        
        public int getMin() {
            return st.peek().minVal;
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
