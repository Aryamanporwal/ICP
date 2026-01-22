package Phase_4.POTD;

import java.util.*;

public class juspay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(minDeleteSum(s1, s2));
        sc.close();
    }

    public static int minDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int sum1 = 0, sum2 = 0;
        for (char c : s1.toCharArray()) sum1 += c;
        for (char c : s2.toCharArray()) sum2 += c;

        int[][] dp = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + s1.charAt(i-1);
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return sum1 + sum2 - 2 * dp[n][m];
    }
}
