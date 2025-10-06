package questions_30;

import java.util.Arrays;

public class maximum_bag_full_ccapacity_rocks {
    class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int [] diff = new int[rocks.length];
        for(int i = 0; i<rocks.length ; i++){
            diff[i] = capacity[i] - rocks[i];
        }
        int count = 0;
        Arrays.sort(diff);
        for(int i = 0; i<diff.length ; i++){
            if(additionalRocks>= diff[i]){
                additionalRocks-= diff[i];
                count++;
            }
        }
        return count;
    }
}
}
