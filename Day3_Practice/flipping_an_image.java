public class flipping_an_image {
    class Solution {
        public int[][] flipAndInvertImage(int[][] image) {
            int n = image.length;
            int m = image[0].length;
            int [][] arr = new int[n][m];
            int p = 0;
            for(int i = 0 ; i<n ; i++){
                int q = 0;
                for(int j = m-1 ; j>=0 ; j--){
                    arr[p][q] = (image[i][j] == 1)?0:1;
                    q++;
                }
                p++;
            }
            return arr;
        }
    }
}
