package End_Game.Maths;
import java.util.*;
public class sieve {
    static int primes[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primes = new int[n+1];
        primes[0] = 1;
        primes[1] = 1;
        for(int i = 2 ; i*i<=n ; i++){
            if(primes[i] == 0){
                int j = i*i;
                while(j<= n){
                    primes[j] = 1;
                    j += i;
                }
            }

        }

        System.out.print((primes[n] == 0) ? true : false);

        sc.close();
    }
    public static List<Integer> primeDivisor(int n){
        List<Integer> ans = new ArrayList<>();
        int start = 2;
        int end = n - start;
        while(start <= end){
            if(primes[start] == 0 && primes[end] == 0){
                ans.add(start);
                ans.add(end);
                return ans;
            }
        }

        return ans;
    }
}
