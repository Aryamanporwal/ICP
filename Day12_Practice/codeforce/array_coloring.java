package codeforce;

import java.util.*;
public class array_coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc --> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int even = 0;
            int odd = 0;
            for(int i = 0 ; i<n ; i++){
                if(arr[i]%2 == 0) even++;
                else odd++;
            }

            if((even >0 && odd>0) || (even == n)){
                System.out.println("YES");
            }else if(odd == n && n%2 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
