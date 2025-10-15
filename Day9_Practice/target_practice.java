import java.util.*;
public class target_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            char [][] mat = new char[10][10];
            for(int i = 0; i<10 ; i++){
                String s = sc.next();
                for(int j = 0; j<10 ; j++){
                    mat[i][j] = s.charAt(j);
                }
            }
            int n = 10;
            int minr = 0;
            int maxr = n-1;
            int minc = 0;
            int maxc = n-1;
            int val = 1;
            int l = 1;
            int sum = 0;
            while(val<=n*n){
                for(int i = minc ; i<=maxc && val<=n*n ; i++){
                    if(mat[minr][i]=='X'){
                        sum+= l ;
                    }
                    val++;
                }
                minr++;

                for(int i = minr ; i<=maxr && val<=n*n ; i++){
                    if(mat[i][maxc] =='X'){
                        sum+= l ;
                    }
                    val++;
                }
                maxc--;

                for(int i = maxc ; i>=minc && val<=n*n ; i--){
                    if(mat[maxr][i] == 'X'){
                        sum+= l ;
                    }
                    val++;
                }
                maxr--;

                for(int i = maxr ; i>=minr && val<=n*n ; i--){
                    if(mat[i][minc] == 'X'){
                        sum+= l ;
                    }
                    val++;
                }
                minc++;

                l++;
            }

            System.out.println(sum);

        }
        sc.close();
    }
}
