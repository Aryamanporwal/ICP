package Day1_Practice;

public class bitwise_and_of_number_range {
    class Solution {
        public int rangeBitwiseAnd(int left, int right) {
            int count = 0;
            while(left<right){
                left = left>>1;
                right = right>>1;
                count++;
            }

            return left << count;
        }
    }
}
