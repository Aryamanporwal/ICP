package Assignment_2;

public class valid_perfect_square {
    class Solution {
        public boolean isPerfectSquare(int num) {
            int low = 0;
            int high = num;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(Math.pow(mid, 2) < num){
                    low = mid+1;
                }else if(Math.pow(mid,2) > num){
                    high = mid-1;
                }else{
                    return true;
                }
            }
            return false;
        }
    }
}
