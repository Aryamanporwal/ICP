package Phase_4.Week_2;
import java.util.*;
public class reverse_string_using_stack{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverse(s));
        sc.close();
    }
    public static String reverse(String S) {
        // code here
        Stack<Character> s = new Stack<>();
        for(char ch : S.toCharArray()){
            s.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        
        return sb.toString();
    }
}