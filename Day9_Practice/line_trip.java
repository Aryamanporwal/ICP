package Day9_Practice;
import java.util.*;
public class line_trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int a[] = new int[n];
            for(int i =0; i<n ; i++){
                a[i] = sc.nextInt();
            }
    
            //maximum distance
            int max_dist_station = a[0];
            for(int i = 1 ; i<n ; i++){
                max_dist_station = Math.max(max_dist_station , a[i]-a[i-1]);
            };
            max_dist_station = Math.max(max_dist_station , (x-a[n-1])*2);
    
            System.out.println(max_dist_station);
        }
        sc.close();
    }
}
