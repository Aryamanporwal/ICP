package End_Game;

import java.util.*;
public class pacific_ocean {
    int m , n;
    int [][] dirs = {{1 , 0} , {-1 , 0} , {0 , 1} , {0 , -1}};
    public List<List<Integer>> ocean(int [][] grid){
        List<List<Integer>> res = new ArrayList<>();

        m = grid.length;
        n = grid[0].length;

        boolean pacific[][] = new boolean[m][n];
        boolean atlantic[][] = new boolean[m][n];

        for(int i = 0; i<m ; i++){
            dfs(i , 0 , grid , pacific);
            dfs(i , n-1 , grid , atlantic);
        }

        for(int i = 0 ; i<n ; i++){
            dfs(0 , i , grid , pacific);
            dfs(m-1 , i , grid , atlantic);
        }

        for(int i = 0; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(Arrays.asList(i , j));
                }
            }
        }

        return res;
        
    }

    public void dfs(int i , int j , int [][] grid , boolean visited[][]){
        visited[i][j] = true;

        for(int dir[] : dirs){
            int new_r = i+dir[0];
            int new_c = j+dir[1];

            if(new_r < 0 || new_r >= m || new_c < 0 || new_c >= n|| visited[new_r][new_c] || grid[new_r][new_c] < grid[i][j]){
                continue;
            }

            dfs(new_r , new_c , grid , visited);


        }
    }
}
