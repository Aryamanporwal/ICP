package Day7_Practice;
import java.util.*;
public class rat_in_maze {
    class Solution {
        ArrayList<String> res = new ArrayList<>();
        public ArrayList<String> ratInMaze(int[][] maze) {
            // code here
            int m = maze.length;
            int n = maze[0].length;
            
            boolean vis[][] = new boolean[m][n];
            recur(0 , 0, maze , "" , vis);
            Collections.sort(res);
            return res;
        }
        
        public void recur(int row , int col , int[][] maze , String path , boolean [][] vis){
            if(row >= maze.length || col >=maze[0].length || row<0 || col<0 || maze[row][col] == 0 || vis[row][col] == true){
                return;
            }   
            if(row == maze.length-1 && col == maze[0].length-1){
                res.add(path);
                return;
            }
            
                vis[row][col] = true;
                recur(row+1 , col , maze , path+"D" , vis);
                recur(row-1 , col , maze, path+"U" , vis);
                recur(row, col+1 , maze, path+"R", vis);
                recur(row , col-1 , maze, path+"L" , vis);
                vis[row][col] = false;
            
        }
    }
}
