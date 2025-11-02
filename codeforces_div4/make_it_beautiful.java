import java.util.*;
public class make_it_beautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i<n ; i++){
                a[i] = sc.nextInt();
            }
            int flag = 0;
            for(int i = 1; i<n ; i++){
                if(a[i-1]!=a[i]){
                    Arrays.sort(a);
                    flag = 1;
                }
            }
            if(flag==1){
                System.out.println("YES");
                System.out.print(a[n-1]+" ");
                for(int i = 0 ; i<n-2 ; i++){
                    System.out.print(a[i]+" ");
                }
                System.out.println(a[n-2]);
            }
            else{
                System.out.println("NO");
            }


        }
    }
}
