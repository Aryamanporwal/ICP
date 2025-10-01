package Day5_Practice;
import java.util.*;
public class fraction_knapsack {
    class Solution {
        public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
            int n = wt.length;
            int item [][] = new int[n][2];
            for(int i = 0; i<n ; i++){
                item[i][0] = wt[i];
                item[i][1] = val[i];
            }
            
            Arrays.sort(item , (a,b) -> Double.compare(
                (double)b[1]/b[0], 
                (double)a[1]/a[0]
            ));
            
            int currCap = 0;
            double ans = 0;
            int i = 0;
            
            while(i<n && currCap < capacity){
                if(currCap + item[i][0] <= capacity){
                    currCap += item[i][0];
                    ans += item[i][1];
                }
                else {
                    int remain = capacity - currCap;
                    ans += (double)item[i][1] * ((double)remain / item[i][0]);
                    currCap = capacity;
                }
                i++;
            }
            
            return ans;
        }
    }

}


