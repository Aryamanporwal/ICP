package Holiday_HomeWork;
import java.util.*;
public class little_elephant_and_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int j = 1;
        for(int i = 0 ; i< n ; i++){
            a[i] = j;
            j++;
        }
        int ans[] = new int[n];
        ans = f(a , n-1);

        for(int i = 0; i<n-1 ; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println(ans[n-1]);
    }

    public static int[] f(int []a , int i){
        if(i == 0){
            return a;
        }
        int temp = a[i-1];
        a[i-1]= a[i];
        a[i] = temp;
        return f(a , i-1);
    }
}
