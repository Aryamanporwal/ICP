import java.util.*;
public class one_and_two {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
 
            int total2 = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == 2){
                    total2++;
                }
            }
            int ans = -1;
            int left = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == 2){
                    left++;
                }
                int right = total2 - left;
                if(left == right){
                    ans = i+1;
                    break;
                }
            }
            System.out.println(ans);
 
            
            
        }
        sc.close();
    }
}
