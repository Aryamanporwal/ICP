package End_Game.PYQ;
import java.util.*;
import java.io.*;
public class power2 {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online    
    public static int ans(int N , List<Integer> A , List<Integer> B){
        long MOD = 1000000007;
        Collections.sort(A , Collections.reverseOrder());
        Collections.sort(B);
        
        long res = 0;
        for(int i = 0; i<N ; i++){
            long pA = power(2 , A.get(i) , MOD);
            res = (res*pA) %MOD;
            res = (res + pA -1) %MOD;
            if(res < 0){
                res += MOD;
            }
            long pB = power(2 , B.get(i) , MOD);
            res = (res*pB) %MOD;
        }
        
        return (int) res;
    }
    
    private static long power(long base , long exp , long mod){
        long res = 1;
        base = base%mod;
        while(exp > 0){
            if((exp&1) == 1){
                res = (res*base) %mod;
            }
            base = (base * base)%mod;
            exp >>= 1;
        }
        
        return res;
    }
     public static void main(String[] args) throws Exception{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if(line == null  || line.trim().isEmpty()) return;
        
        int N = Integer.parseInt(line.trim());
        List<Integer> A = new ArrayList<>();
        for(int j = 0 ; j<N ; j++){
            A.add(Integer.parseInt(br.readLine().trim()));
        }
        
        List<Integer> B = new ArrayList<>();
        for(int j = 0 ; j<N ; j++){
            B.add(Integer.parseInt(br.readLine().trim()));
        }
        
        
        int res = ans(N , A , B);
        System.out.println(res);
    }
}

