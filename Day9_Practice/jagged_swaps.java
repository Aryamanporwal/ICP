package Day9_Practice;
import java.util.*;
public class jagged_swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int flag = 0; //1-> "NO"
            for(int i = 0; i<n ; i++){
                a[i] = sc.nextInt();
                if(a[i]>n || a[i]<0){
                    flag = 1;
                }
            }
            for(int i = 1; i<n-1 ; i++){
                if(a[i]>a[i-1] && a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
                if(a[i]<=a[i-1]){
                    flag = 1;
                }
            }

            if(flag == 1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
