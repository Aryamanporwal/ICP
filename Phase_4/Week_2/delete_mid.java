package Phase_4.Week_2;
import java.util.*;
public class delete_mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer>s = new Stack<>();
        recur(s , s.size() , 0);
        sc.close();
    }
    
    public static void recur(Stack<Integer> st , int size , int ptr){
        if(ptr == size/2){
            st.pop();
            return;
        }
        
        int x = st.pop();
        ptr++;
        
        recur(st , size , ptr);
        st.push(x);
    }
}
