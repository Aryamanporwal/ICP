import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i =0; i<n ; i++){
            for(int j = 0; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // displayrow(arr);
        // displaycol(arr);

        // System.out.println("spiral");
        spiral(arr);
        int [] rs = {1,2,3,4,5,6,7,8,9};
        int [][] ans = onetotwo(rs, 3, 3);
        displayrow(ans);
    }
    public static void displayrow(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0; i<n ; i++){
            for(int j= 0; j<m ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void displaycol(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int j = 0 ; j <m ; j++){
            for(int i = 0 ; i<n ; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void spiral(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int maxr = n-1;
        int minc = 0;
        int maxc = m-1 ;
        int minr = 0;
        int t = n*m;
        while(t-->0){
            //left to right
            for(int j = minc ; j<=maxc ; j++){
                System.out.print(arr[minr][j]+"-->");
                t--;
            }
            minr++;

            //top to bottom
            for(int i = minr ; i<=maxr  ; i++){
                System.out.print(arr[i][maxc]+"-->");
                t--;
            }
            maxc--;
            
            //right to left
            for(int j = maxc ; j>=minc; j--){
                System.out.print(arr[maxr][j]+"-->");
                t--;
            }
            maxr--;
            
            //bottom to up
            for(int i = maxr ; i>=minr ; i--){
                System.out.print(arr[i][minc]+"-->");
                t--;
            }
            minc++;
        }

    }

    
    public static void reverse(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i = m-1 ; i>=0; i--){
            for(int j = n-1 ; j>=0 ; j--){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] onetotwo(int[]arr , int row  , int col){
        int res[][] = new int[row][col];
        int size = arr.length-1;
        for(int i = 0; i<row ; i++){
            for(int j = 0; j<col ; j++){
                res[i][j] = arr[size--];
            }
        }
        return res;
    }
}
