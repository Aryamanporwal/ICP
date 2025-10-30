package Holiday_HomeWork;
import java.util.*;
public class binary_string_minimizing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q= sc.nextInt();
        while(q-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            String s = sc.next();
            char ch[] = s.toCharArray();
            //sorting untill k moves and then return
            long onesBefore = 0;
            ArrayList<Integer> zeros = new ArrayList<>();
            for(int i= 0 ; i<n ; i++){
                if(ch[i]=='1'){
                    onesBefore++;
                }else{
                    long moves = Math.min(k , onesBefore);
                    k -= moves;
                    zeros.add((int)(i-moves));
                }
            }
            // int j = 0;
            // while(k>0 && j<n-1){
            //     if(k>0 && ch[j+1]<ch[j]){
            //         ch[j+1] = '1';
            //         ch[j] = '0';
            //         k--;
            //         j = 0;
            //     }else{
            //         j++;
            //     }
            // }
            char ans[] = new char[n];
            Arrays.fill(ans , '1');
            for(int i:zeros){
                ans[i] = '0';
            }
            System.out.println(new String(ans));
            
        }
    }
}
