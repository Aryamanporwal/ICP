package Phase_4.Week_3;
import java.util.*;
public class Maximum_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long arr[] = new long[n];
            long ans = Long.MIN_VALUE;
            for(int i = 0 ; i<n ; i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);

            //prefix sum
            long[] preSum = new long[n+1];
            for(int i = 0; i<n ; i++){
                preSum[i+1] = preSum[i] + arr[i];
            }

            long totSum = preSum[n];

           
            for(int i = 0 ;i<=k ; i++){
                int remMin = 2*i;
                int remMax = k-i;

                if(remMin + remMax > n) continue;

                long sumRemMin = preSum[remMin];
                long sumRemMax = preSum[n] - preSum[n-remMax];

                long totalRemainingSum = totSum - sumRemMax - sumRemMin;
                ans = Math.max(ans , totalRemainingSum);

            }
            System.out.println(ans);
        }
        sc.close();
    }
}
