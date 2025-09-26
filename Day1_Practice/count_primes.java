package Day1_Practice;

public class count_primes {
    class Solution {
        public int countPrimes(int n) {
            int [] p = new int[n+1];

            for(int i = 2; i*i<=n ; i++){
                if(p[i]==0){
                    int j = i*i;
                    while(j<=n){
                        p[j] = 1;
                        j+=i;
                    }
                }
            }
            int c = 0;
            for(int i = 2; i<n ; i++){
                if(p[i]==0){
                    c++;
                }
            }
            return c;
        }
    }
}
