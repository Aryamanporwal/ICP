

public class integer_replacement {
    class Solution {
        public int integerReplacement(int n_initial) {
            long n = n_initial;
            int count = 0;
            while(n!=1){
                if(n%2==0){
                    n = n/2;
                }
                else{
                    //even and chota
                    long q = n-1;
                    long p = n+1;
                    long temp = q/2;
                    long temp1 = p/2;
                    if(temp%2 == 0 || temp==1){
                        n = n-1;
                    }else if(temp1%2 == 0 || temp1==1){
                        n = n+1;
                    }
                }
                count++;
            }

            return count;
        }
    }
}
