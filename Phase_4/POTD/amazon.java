package Phase_4.POTD;
import java.util.*;

public class amazon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        System.out.println(minOperations(num));
        sc.close();
    }

    private static int minOperations(String num) {
        int n = num.length();
        String[] targets = {"00", "25", "50", "75"};
        int ans = n; // worst case: delete all digits

        for (String t : targets) {
            int ops = 0;
            int i = n - 1;
            int j = 1; // index in target

            while (i >= 0 && j >= 0) {
                if (num.charAt(i) == t.charAt(j)) {
                    j--;
                } else {
                    ops++;
                }
                i--;
            }

            if (j < 0) { 
                // matched both digits of target
                ans = Math.min(ans, ops);
            }
        }

        return ans;
    }
}
