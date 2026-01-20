package Phase_4.Week_1_Challenge;
import java.util.*;
public class remove_the_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int maxLen = 0;
        int n = s.length();
        int m = t.length();
        int i = 0;
        int j = 0;

        while(i<n){
            if(j<m && s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                int temp = i;
                while(temp < n && i <n && s.charAt(temp) != t.charAt(j)){
                    temp++;
                    maxLen = Math.max(maxLen , temp-i);
                }
                i = temp;
            }
        }

        System.out.println(maxLen);

        sc.close();
    }
}
