package Day11_Practice.codeforces;
import java.util.*;

public class notelock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            
            int ans = 0;
            int last = -k;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (i - last >= k) {
                        ans++;
                        last = i;
                    } else {
                        last = i; 
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
