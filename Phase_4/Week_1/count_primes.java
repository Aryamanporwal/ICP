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
        boolean[] prime = new boolean[n]; //made a prime boolean array having all elements from 1 to n-1 and all are intially false , depiting none is prime
        Arrays.fill(prime , true); // we initially say all are prime
        prime[0] = false; 
        prime[1] = false;

        for(int i = 2 ; i*i<n ; i++){ //iterate till the sqrt of n , 
            if(prime[i]){ //check if the element is prime
                for(int j= i*i ; j<n ; j+=i){ //then we put all the multiples of i to false , because they can not be prime
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
