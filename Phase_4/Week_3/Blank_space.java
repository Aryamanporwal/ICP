package Phase_4.Week_3;
import java.util.*;
public class Blank_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int size = Integer.MIN_VALUE;
            int count = 0;
            for(int i = 0; i<n ; i++){
                if(arr[i] == 1){
                    size = Math.max(size , count);
                    count = 0;
                }
                else if(arr[i] == 0){
                    count++;
                }
            }
            size = Math.max(size , count);

            System.out.println(size);
        }
    }
}
