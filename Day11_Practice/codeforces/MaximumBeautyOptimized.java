package Day11_Practice.codeforces;

import java.io.*;
import java.util.*;

public class MaximumBeautyOptimized {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            int max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                max = Math.max(max, a[i]);
            }

            int[] freq = new int[max + 2];
            for (int x : a) freq[x]++;

            int ans = 1;

            // iterate over all possible gcds
            for (int g = 1; g <= max; g++) {
                int count = 0;
                // count numbers within ±1 of multiple of g
                for (int x = g; x <= max; x += g) {
                    count += freq[x];
                    if (x - 1 > 0) count += freq[x - 1];
                    if (x + 1 <= max) count += freq[x + 1];
                    if (count >= n - k) break; // early exit
                }
                if (count >= n - k) ans = g;
            }

            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}
