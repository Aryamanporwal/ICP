
import java.util.Arrays;

public class candy {
    class Solution {
        public int candy(int[] ratings) {
            int n = ratings.length;
            int candy[] = new int[n];
            Arrays.fill(candy , 1);
            //left to right
            for(int i = 1; i<candy.length ; i++){
                if(ratings[i-1] < ratings[i]){
                    candy[i] = candy[i-1]+1;
                }
            }
            //right to left
            for(int i = candy.length-2 ; i>=0 ; i--){
                if(ratings[i+1] < ratings[i]){
                    candy[i] = Math.max(candy[i] , candy[i+1]+1);
                }
            }
            int sum = 0;
            for(int i : candy){
                sum += i;
            }
            return sum;
        }
    }
}
