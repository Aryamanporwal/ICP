package Day2_Practice;

public class koko_eating_banana {
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int high = Integer.MIN_VALUE;
            int n = piles.length;
            for(int i =0; i<n ; i++){
                high = Math.max(piles[i] , high);
            }
            int ans = -1;
            int low = 1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(caneat(piles , mid) <= h){
                    ans = mid;
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }
            return ans;
        }

        public int caneat(int []p , int k){
            int sum = 0; 
            for(int i = 0; i<p.length ; i++){
            sum += Math.ceil((double)p[i]/(double)k);   
            }
            return sum;
        }
    }
}
