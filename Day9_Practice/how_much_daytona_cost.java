import java.util.*;

public class how_much_daytona_cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int flag = 0;
            int [] arr = new int[n];
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i]==k) flag = 1;
            }
            System.out.println(flag==1? "YES": "NO");

        }        
    }
}
