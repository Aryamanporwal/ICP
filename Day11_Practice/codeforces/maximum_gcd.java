package Day11_Practice.codeforces;
import java.util.*;
public class maximum_gcd{
    public static void main(String[]v){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            long[] freq = new long[n+1];
            long [] count = new long[n+1];
            for(int x:a){
                freq[x]++;
            }
            for(int i=1;i<=n;i++){
                count[i]=count[i-1]+freq[i];
            }
            int ans=1;
            for(int d=n; d>=1; d--){
                long u = Math.min(n, 4L*d-1);
                long tots;
                if(u>=1){
                    tots = count[(int)u];
                }else{
                    tots = 0;
                }
                long sm=freq[d];
                long totd=2L*d;
                if(totd<=n){
                    sm+=freq[(int)totd];
                }
                totd=3L*d;
                if(totd<=n){
                    sm+=freq[(int)totd];
                }
                long bad=tots-sm;
                if(bad<=k){
                    ans=d;
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}