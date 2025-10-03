package Day6_Practice;

public class power_of_two {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            //multiple of 2 will only have single 1 in thier binary representation

            // if(n<=0) return false;
            // int cnt = Integer.bitCount(n);
            // return cnt==1; 

            if(n <= 0) return false;
            if(n==1) return true;
            return (n%2==0) && isPowerOfTwo(n/2);
        }

    }
}
