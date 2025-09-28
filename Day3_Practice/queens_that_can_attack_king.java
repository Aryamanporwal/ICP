import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class queens_that_can_attack_king {
    class Solution {
        public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
            int q = queens.length;
            int n = 8;
            int m = 8;
            boolean [][] chess = new boolean[m][n];
            for(int i = 0; i<q ; i++){
                int a = queens[i][0];
                int b = queens[i][1];
                chess[a][b] = true;
            }
            List<List<Integer>> ans = new ArrayList<>();
            
            int [][] dir = {
                {1,0} , {-1,0},
                {0,1} , {0,-1},
                {1,1}, {1,-1},
                {-1,1}  , {-1,-1}
            };
            for(int []d : dir){
                int x = king[0] , y = king[1];
                while(x>=0 && y>=0 && x<n && y<n){
                    if(chess[x][y]){
                        ans.add(Arrays.asList(x,y));
                        break;
                    }
                    x+=d[0];
                    y+=d[1];
                }
            }
            return ans;
        }
    }
}
