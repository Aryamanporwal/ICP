package Phase_4.Week_2;
public class Stack_implementation_using_array {
    public static void main(String[] args) {
        Stack st = new Stack(4);
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.push(4);
        st.peek();


    }

    static class Stack{
        int [] a;
        int ptr;

        public Stack(int n){
            this.a = new int[n];
            this.ptr = -1;
        }

        public void push(int val){
            if(ptr == a.length-1){
                System.out.println("Stack Overflow");
                return;
            }
            ptr++;
            a[ptr] = val;
        }

        public void peek(){
            if(ptr == -1){
                System.out.println("Stack Underflow");
                return;
            }
            System.out.println(a[ptr]);
        }

        public void pop(){
            if(ptr == -1){
                System.out.println("Stack UnderFlow");
            }
            System.out.println(a[ptr]);
            ptr--;
        }
    }
}
