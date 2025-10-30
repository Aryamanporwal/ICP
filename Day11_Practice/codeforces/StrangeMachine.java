package Day11_Practice.codeforces;
import java.util.*;
 
public class StrangeMachine {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();

            int [] type = new int[n];
            for(int i =0 ; i<n ; i++){
                if(s.charAt(i) == 'A'){
                    type[i] = 0;
                }else{
                    type[i] = 1;
                }
            }

            long a[] = new long[q];
            for(int i = 0; i<q ; i++){
                a[i] = sc.nextLong();
            }

            StringBuilder ans = new StringBuilder();
            for(int i =0; i<q ; i++){
               long p = a[i];
               int pos = 0;
               long step = 0;
               while(p>0){
                if(type[pos] == 0){
                    p = p-1;
                }else{
                    p = p/2;
                }

                step++;

                pos = (pos+1)%n;
               } 

               ans.append(step).append("\n");
            }

            System.out.print(ans);
        }
        sc.close();
   }
}
