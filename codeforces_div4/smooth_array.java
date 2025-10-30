import java.util.*;
public class smooth_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int c [] = new int[n];
            for(int i = 0; i<n ; i++){
                c[i] = sc.nextInt();
            }
            long[] dp = new long[n];
            long maxKeep = 0;

            for (int i = 0; i < n; i++) {
                dp[i] = c[i];
                for (int j = 0; j < i; j++) {
                    if (arr[j]<=arr[i]) {
                        dp[i] = Math.max(dp[i], dp[j]+c[i]);
                    }
                }
                maxKeep = Math.max(maxKeep, dp[i]);
            }

            long total = 0;
            for (long x : c) total += x;

            System.out.println(total - maxKeep);
        }
        sc.close();
    }
}
