package questions_30;

import java.util.Arrays;

public class full_bloom_flowers {
    class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int m = flowers.length;
        int n = people.length;

        int start []  = new int[m];
        int end [] = new int[m];
        int res[] = new int[n];

        for(int i = 0; i<m ; i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        for(int i = 0; i<n ; i++){
            int time = people[i];
            int bloomed_flowers = upper_bound(start , time);
            int died_already = lower_bound(end , time);
            res[i] = bloomed_flowers-died_already;
        }
        return res;
    }
    public int upper_bound(int [] start , int time){
        int low = 0;
        int high = start.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(start[mid]<=time){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans+1;
    }
    public int lower_bound(int [] end , int time){
        int low = 0;
        int high = end.length-1;
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(end[mid]<time){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}
}
