package Day11_Practice;
import java.util.*;
public class unit_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int oneP = 0;
            int oneN = 0;
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == -1){
                    oneN++;
                }else{
                    oneP++;
                }
            }
            //if number of 1 and -1 are equal then only both the condition will fullfill
            //a1+ a2+ a3+ .... +an >=0 
            //a1* a2* a3* .... *an = 1
            int ans = 0;
            while(oneP < oneN){
                oneP++;
                oneN--;
                ans++;
            }

            // Step 2: Make product = 1
            // (number of -1s must be even)
            if(oneN % 2 == 1){
                ans++;
                oneN--;
                oneP++;
            }

            System.out.println(ans);


        }
    }
}
