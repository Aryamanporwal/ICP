package End_Game;
import java.util.*;
public class path_with_min_efforts {
    public int minEfforts(int [][] heights){
        int n = heights.length;
        int m = heights[0].length;

        int [][] res = new int[n][m];

        for(int i = 0 ; i<n ; i++){
            Arrays.fill(res[i] , Integer.MAX_VALUE);
        }   

        PriorityQueue<pair> pq = new PriorityQueue<>((a , b) -> a.cost - b.cost);

        res[0][0] = 0;
        pq.add(new pair(0 , new node(0  , 0)));
        
        int [][] dir = {{0 , 1} , {0 , -1} , {1 , 0} , {-1 , 0}};

        while(!pq.isEmpty()){
            pair rm = pq.poll();
            int eff = rm.cost;
            int r = rm.n.row;
            int c = rm.n.col;

            if(r == n-1 && c == m-1) return eff;

            for(int [] d: dir){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr >= 0 && nc >= 0 && nr < n && nc < m){
                    int newEffort = Math.max(eff , Math.abs(heights[r][c] - heights[nr][nc]));

                    if(res[nr][nc] > newEffort){
                        res[nr][nc] = newEffort;
                        pq.add(new pair(newEffort , new node(nr , nc)));
                    }
                }
            }
        }

        return 0;


    }
}

class pair{
    int cost;
    node n;
    public pair(int c , node n){
        this.n = n;
        this.cost = c;
    }
}

class node{
    int row;
    int col;
    public node(int r , int c){
        this.row = r;
        this.col = c;
    }   
}
