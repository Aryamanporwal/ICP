package Phase_4.Week_1_Challenge;
import java.util.*;
public class Ehab_fails_to_be_thanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n*2];
        for(int i = 0 ; i<2*n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0  ; i<n ; i++){
            leftSum += arr[i];
            rightSum += arr[n+i];
        }

        
        if(leftSum == rightSum){
            System.out.println(-1);
        }else{
            for(int i = 0; i<2*n ; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

