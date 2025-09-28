public class convert_1D_to_2D_array {
    class Solution {
        public int[][] construct2DArray(int[] original, int m, int n) {
            int arr[][] = new int[m][n];
            if(m*n != original.length){
                return new int[0][0];
            }
            int k = 0;
            for(int i = 0; i<original.length && k<m; ){
                int j = 0;
                while(j<n){
                    arr[k][j] = original[i];
                    j++;
                    i++;
                }
                k++;
            }
            return arr;
        }
    }
}
