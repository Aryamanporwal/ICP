package Day11_Practice.codeforces;
import java.util.*;
public class no_cost_too_great {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int[] b = new int[n];
            for(int i=0;i<n;i++) b[i]=sc.nextInt();

            boolean found = false;

            outer:
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(gcd(a[i], a[j]) > 1){
                        found = true;
                        break outer;
                    }
                }
            }
            if(found){
                System.out.println(0);
                continue;
            }

       
            found = false;
            for(int i=0; i<n; i++){
                a[i]++;
                for(int j=0; j<n; j++){
                    if(i != j && gcd(a[i], a[j]) > 1){
                        found = true;
                        break;
                    }
                }
                a[i]--; 
                if(found) break;
            }
            if(found){
                System.out.println(1);
            }else{
                System.out.println(2);
            }

        }

        sc.close();
    }

    static int gcd(int x,int y){
        while(y!=0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }
}
