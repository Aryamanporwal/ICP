package Day11_Practice.codeforces;

import java.util.*;

public class make_it_zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            // Apply operation 1: make prefix max array
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) a[i] = a[i - 1];
            }
            
            // Calculate cost for pattern 1: odd indices valleys
            long cost1 = calculateCost(a, true);
            // Calculate cost for pattern 2: even indices valleys
            long cost2 = calculateCost(a, false);

            System.out.println(Math.min(cost1, cost2));
        }
        sc.close();
    }

    // If oddValleys is true, odd indices must be valleys, else even indices
    static long calculateCost(long[] arr, boolean oddValleys) {
        long cost = 0;
        long[] a = arr.clone();
        int n = a.length;

        for (int i = 0; i < n; i++) {
            boolean isValley = (oddValleys) ? (i % 2 == 0) : (i % 2 == 1);
            if (isValley) {
                long left = i > 0 ? a[i - 1] : Long.MAX_VALUE;
                long right = i < n - 1 ? a[i + 1] : Long.MAX_VALUE;
                long limit = Math.min(left, right) - 1;
                if (a[i] > limit) {
                    cost += a[i] - limit;
                    a[i] = limit;
                }
            }
        }
        return cost;
    }
}
