package Day7_Practice;

public class unique_path_iii {
    class Solution {
        public int uniquePathsIII(int[][] grid) {
            int zero = 0, sx = 0, sy =0;
            for(int i = 0;i<grid.length; i++){
                for(int j = 0; j<grid[0].length; j++){
                    if(grid[i][j]==0) zero++;
                    else if(grid[i][j]==1) {
                        sx = i;
                        sy = j;
                    }
                }
            }
            return solve(grid, sx , sy, zero);
        }

        public int solve(int[][] grid, int sx, int sy, int zero){
            if(sx<0 || sx>=grid.length || sy<0 || sy>=grid[0].length || grid[sx][sy]==-1) return 0;

            if(grid[sx][sy]==2){
                return zero == -1 ? 1: 0;
            }
            grid[sx][sy] = -1;
            zero--;
            int totalPath = solve(grid, sx+1, sy, zero)+solve(grid, sx, sy+1, zero)+solve(grid, sx-1, sy, zero)+ solve(grid, sx, sy-1, zero);

            grid[sx][sy] = 0;
            zero++;

            return totalPath;
        }

    }
}
