package Day9_Practice;
import java.util.*;
public class halloumi_boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i<n ; i++){
                a[i] = sc.nextInt();
            }
            int sorted = 1;
            for(int i = 0 ; i<n-1 ;i++){
                if(a[i]>a[i+1]){
                    sorted = 0;
                    break;
                }
            }
            if(sorted==1 || k>=n){
                System.out.println("YES");
            }else{
                if(n<=k || k==1){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
    }
}
