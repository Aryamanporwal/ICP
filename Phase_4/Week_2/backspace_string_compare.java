package Phase_4.Week_2;

import java.util.*;

public class backspace_string_compare {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       String t = sc.next();
        System.out.println(backspaceCompare(s , t));
       sc.close(); 
    }
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st1.isEmpty() && ch=='#'){
                st1.pop();
            }else if(ch!='#'){
                st1.push(ch);
            }
        }
        for(char ch : t.toCharArray()){
            if(!st2.isEmpty() && ch=='#'){
                st2.pop();
            }else if(ch!='#'){
                st2.push(ch);
            }
        }
        if(st1.size() != st2.size()){
            return false;
        }

        while(!st1.isEmpty()){
            if(st1.pop() != st2.pop()){
                return false;
            }
        }
        return true;

    }
}
