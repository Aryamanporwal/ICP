import java.util.ArrayList;
import java.util.List;

public class lucky_number {
    class Solution {
        public List<Integer> luckyNumbers(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> rowmax = new ArrayList<>();
            for(int i = 0 ; i<m ; i++){
                int min = Integer.MAX_VALUE;
                for(int j = 0; j<n ; j++){
                    min = Math.min(matrix[i][j] , min);
                }
                rowmax.add(min);
            }

            ArrayList<Integer> colmax = new ArrayList<>();
            for(int j = 0 ; j<n ; j++){
                int max = Integer.MIN_VALUE;
                for(int i = 0; i<m ; i++){
                    max = Math.max(matrix[i][j] , max);
                }
                colmax.add(max);
            }

            for(int i = 0; i<m ; i++){
                for(int j = 0; j<n ; j++){
                    if(rowmax.contains(matrix[i][j]) && colmax.contains(matrix[i][j])){
                        arr.add(matrix[i][j]);
                    }
                }
            }
            return arr;    
        }
    }
}
