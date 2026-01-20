package Phase_4.Week_2;
import java.util.*;
public class Valid_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
        sc.close();
    }
    public static boolean isValid(String s) {  
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push('(');
            }
            else if(ch == '['){
                st.push('[');
            }
            else if(ch == '{'){
                st.push('{');
            }
            else if(ch == ')' && st.peek() == '('){
                st.pop();
            }else if(ch == ']' && st.peek() == '['){
                st.pop();
            }else if(ch == '}' && st.peek() == '{'){
                st.pop();
            }
        }

        return st.size() == 0 ? true : false;
    }
}
