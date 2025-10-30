import java.util.*;
public class array_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long a[] = new long[n];
            long g = 0;
            for(int i= 0; i<n ; i++){
                a[i] = sc.nextLong ();
                g = gcd(g ,a[i]);
                if(g==1){
                    for(int j = i+1 ; j<n ; j++){
                        a[j]  = sc.nextLong();
                    }
                    break;
                }
            }

            long ans = -1;
            for(long x= 2 ; x<=1000 ; x++){
                if(gcd(g , x)==1){
                    ans = x;
                    break;
                }
            }

            System.out.println(ans);

        }
    }
    public static long gcd(long a , long b){
        while(b!=0){
            long t = b;
            b = a%b ;
            a  = t;
        }
        return a;
    }
}
