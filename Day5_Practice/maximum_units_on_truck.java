
import java.util.*;
public class maximum_units_on_truck {
    class Solution {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            Arrays.sort(boxTypes, (a,b)->Integer.compare(b[1],a[1]));
            int currCap = 0;
            int ans = 0;
            int i =0;
            int n = boxTypes.length;
            while(i<n && currCap<truckSize){
                    int canTake = Math.min(truckSize - currCap, boxTypes[i][0]); 
                    ans += canTake * boxTypes[i][1];
                    currCap += canTake;
                    i++;
            }
            return ans;
        }
    }
}
