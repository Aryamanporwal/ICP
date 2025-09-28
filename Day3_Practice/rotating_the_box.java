public class rotating_the_box {
    class Solution {
        public char[][] rotateTheBox(char[][] boxGrid) {
            int m = boxGrid.length;
            int n = boxGrid[0].length;
            char rotbox [][] = new char[n][m];
            for(int i= 0; i<m ; i++){
                for(int j = 0; j<n ; j++){
                    rotbox[j][m-1-i] = boxGrid[i][j];
                }
            }
            //column wise niche se iterate krna h
            //m - column
            //n - row
            for(int j = 0; j<m ; j++){
                int k = n-1;
                for(int i = n-1 ; i>=0 ; i--){
                    if(rotbox[i][j] == '*'){
                        k = i-1;
                    }
                    else if(rotbox[i][j] == '#'){
                        if(i!=k){
                                rotbox[i][j] = '.';
                                rotbox[k][j] = '#';
                        }
                        k--;
                    }
                }
            }
            return rotbox;
        }
    }
}
