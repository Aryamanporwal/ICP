package Phase_4.Week_1;
import java.util.*;
public class count_primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countprime(n));
        sc.close();
    }

    public static List<Integer> countprime(int n){
        boolean[] prime = new boolean[n];
        Arrays.fill(prime , true);
        prime[0] = false;
        prime[1] = false;

        for(int i = 2 ; i*i<n ; i++){
            if(prime[i]){
                for(int j= i*i ; j<n ; j+=i){
                    prime[j] = false;
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 2 ; i<n ; i++){
            if(prime[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}
