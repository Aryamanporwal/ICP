import java.util.*;
public class ambitious_kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        int minN = Integer.MAX_VALUE;
        int minP = Integer.MAX_VALUE;
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>=0) minP = Math.min(minP , arr[i]);
            else minN = Math.min(minN , Math.abs(arr[i]));
        }
        System.out.println(Math.min(minN , minP));
    }
}
