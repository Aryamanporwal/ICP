package End_Game;
import java.util.*;
class node{
    int row;
    int col;
    public node(int r , int c){
        this.row = r;
        this.col = c;
    }
}

class pair{
    int time;
    node n;
    public pair(int t , node n){
        this.time = t;
        this.n =n;
    }
}
public class rotting_oranges {
    public int orangesRotting(int [][] grid){
        int m = grid.length;
        int n = grid[0].length;
        Queue<pair> q = new LinkedList<>();
        boolean [][] visited = new boolean[m][n];
        for(int i= 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j] == 2){
                    q.offer(new pair(0,new node(i , j) ));
                    visited[i][j] = true;
                }
            }
        }

        int ans = 0;
        while(!q.isEmpty()){
            pair r = q.poll();

            int time = r.time;
            node n1 = r.n;
            int i = n1.row;
            int j = n1.col;

            ans = Math.max(ans , time);
            if(i+1 < m && !visited[i+1][j] && grid[i+1][j] == 1){
                visited[i+1][j] = true;
                q.offer(new pair(time+1 , new node(i+1 , j)));
            }

            if(i-1 >= 0 && !visited[i-1][j] && grid[i-1][j] == 1){
                visited[i-1][j] = true;
                q.offer(new pair(time+1 , new node(i-1 , j)));
            }

            if(j+1 < n && !visited[i][j-1] && grid[i][j+1] == 1){
                visited[i][j+1] = true;
                q.offer(new pair(time+1 , new node(i , j+1)));
            }
            if(j-1 >= 0 && !visited[i][j-1] && grid[i][j-1] == 1){
                visited[i][j-1] = true;
                q.offer(new pair(time+1 , new node(i , j-1)));
            }
        }

        for(int i= 0; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(visited[i][j] == false){
                    return -1;
                }
            }
        }
        return ans;
    }
}
