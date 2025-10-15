import java.util.*;
public class goals_of_victory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int eff[] = new int[n-1];
            for(int i =0; i< n-1; i++){
                eff[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                sum += eff[i];
            }

            System.out.println(-sum);
        }
    }
}
