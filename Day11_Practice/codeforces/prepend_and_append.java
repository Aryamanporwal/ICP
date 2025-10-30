package Day11_Practice.codeforces;
import java.util.*;
public class prepend_and_append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int len = sc.nextInt();
            String s = sc.next();
            int start= 0;
            int end = len-1;
            int ans = len;
            while (start<end) {
                if(s.charAt(start) != s.charAt(end)){
                    start++;
                    end--;
                    ans -= 2;
                }else{
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
