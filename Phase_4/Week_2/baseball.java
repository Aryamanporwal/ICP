package Phase_4.Week_2;
import java.util.*;
public class baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] op = new String[n];
        for(int i = 0 ; i<n ; i++){
            op[i] = sc.next();
        }

        System.out.println(calPoints(op));
        sc.close();
    }
       public static int calPoints(String[] operations) {
        int n = operations.length;
        Stack<String> st = new Stack<>();
        for(String s : operations){
            if(s.matches("-?\\d+")){
                st.push(s);
            }else if(!st.isEmpty() && s.equals("C")){
                st.pop();
            }else if(!st.isEmpty() && s.equals("D")){
                st.push(String.valueOf(Integer.parseInt(st.peek())*2));
            }
            else if(!st.isEmpty() && st.size() >= 2 && s.equals("+")){
                int x = Integer.parseInt(st.pop());
                int y = Integer.parseInt(st.pop());
                int z = x+y;
                st.push(String.valueOf(y));
                st.push(String.valueOf(x));
                st.push(String.valueOf(z));
            }
        }

        int score = 0;
        while(!st.isEmpty()){
            score += Integer.parseInt(st.pop());
        }
        return score;
    }
}
