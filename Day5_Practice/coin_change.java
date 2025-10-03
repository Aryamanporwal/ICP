
public class coin_change {
    class Solution {
    public int findMin(int n) {
        // code here
            int [] coins = {10,5,2,1};
            int currCoin = 0;
            int i =0; 
            int count = 0;
            while(i < 4){
                while(currCoin+coins[i] <= n){
                    currCoin += coins[i];
                    count++;
                }
                i++;
            }
            return count;
        }
    }
}
