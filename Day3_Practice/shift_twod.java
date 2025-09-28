import java.util.ArrayList;
import java.util.List;

public class shift_twod {
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int m = grid.length;
            int n = grid[0].length;
            int idx = 0;
            int total = m*n;
            int shift[] = new int[m*n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    shift[idx++] = grid[i][j];
                }   
            }  
            idx = 0;  
            List<List<Integer>> ans = new ArrayList<>();
            int[] shifted = new int[total];
            for (int i = 0; i < total; i++) {
                shifted[(i + k) % total] = shift[i];
            }
            for(int i=0;i<m;i++){
                List<Integer> temp = new ArrayList<>();
                for(int j=0;j<n;j++){
                    temp.add(shifted[idx++]);
                }
                ans.add(temp);
            }
            return ans;
        }
    }
}
