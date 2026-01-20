package Phase_4.Week_2;
import java.util.*;
public class remove_outermost_paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(removeOuterParentheses(s));
        sc.close();
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for(char c : s.toCharArray()) {
            if(c == '(') {
                if(depth > 0) sb.append(c);
                depth++;
            } else { // c == ')'
                depth--;
                if(depth > 0) sb.append(c);
            }
        }
        return sb.toString();
    }
}
