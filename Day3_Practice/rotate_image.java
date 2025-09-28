public class rotate_image {
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            boolean visited [][] = new boolean[m][n];
            for(int i = 0;  i<n; i++){
                for(int j = 0; j<m ; j++){
                    if(!visited[i][j]){
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;
                        visited[i][j] = true;
                        visited[j][i] = true;
                    }
                }
            }

            int lo = 0;
            int hi = m-1;
            while(lo<hi){
                for(int i =0; i<n ; i++){
                    int temp = matrix[i][lo];
                    matrix[i][lo] = matrix[i][hi];
                    matrix[i][hi] = temp;
                }
                lo++;
                hi--;
            }

        }
    }
}
