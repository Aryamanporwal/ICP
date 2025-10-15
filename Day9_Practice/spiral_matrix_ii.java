public class spiral_matrix_ii {
    class Solution {
    public int[][] generateMatrix(int n) {
        int [][] mat = new int[n][n];
        int minr = 0;
        int maxr = n-1;
        int minc = 0;
        int maxc = n-1;
        int val = 1;
        while(val<=n*n){
            for(int i = minc ; i<=maxc && val<=n*n ; i++){
                mat[minr][i] = val;
                val++;
            }
            minr++;

            for(int i = minr ; i<=maxr && val<=n*n ; i++){
                mat[i][maxc] = val;
                val++;
            }
            maxc--;

            for(int i = maxc ; i>=minc && val<=n*n ; i--){
                mat[maxr][i] = val;
                val++;
            }
            maxr--;

            for(int i = maxr ; i>=minr && val<=n*n ; i--){
                mat[i][minc] = val;
                val++;
            }
            minc++;
        }

        return mat;
    }
}
}
