package questions_30;

public class maximum_path_with_max_gold {
    class Solution {
        public int getMaximumGold(int[][] grid) {
            int max = 0;
            for(int i = 0 ; i<grid.length ; i++){
                for(int j = 0 ; j<grid[0].length ; j++){
                    max = Math.max(max, solve(i, j, grid, new boolean[grid.length][grid[0].length]));
                }
            }
            return max; 
        }
        private int solve(int i , int j , int[][] grid, boolean[][]vis){
            if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || vis[i][j] ||  grid[i][j] == 0){
                return 0;
            }

            vis[i][j] = true;
            int max = grid[i][j]+Math.max(Math.max(solve(i+1 , j , grid , vis) , solve(i-1 , j , grid, vis)) , Math.max(solve(i , j-1 , grid, vis ) , solve(i , j+1 , grid , vis)));
            vis[i][j] = false;

            return max;
        }
    }
}
