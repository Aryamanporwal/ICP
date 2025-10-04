package Day7_Practice;

import java.util.Arrays;

public class nqueens_ii {
    class Solution {
        int ans = 0;
        public int totalNQueens(int n) {
        String[][] arr = new String[n][n];
        for(String [] s : arr){
            Arrays.fill(s , ".");
        }
        queens(arr , n , 0);
        return ans;
        }

        public void queens(String [][] board , int n , int cr){
            if(cr == n){
                ans++;
                return ;
            }
            for(int cc = 0 ; cc<n ; cc++){
                if(ifpossible(cc , cr , board)){
                    board[cr][cc] = "Q";
                    queens(board , n , cr+1);
                    board[cr][cc] = ".";
                }
            }
        }

        public boolean ifpossible(int cc , int cr , String board[][]){
            //upper

            for(int row = cr ; row>=0 ; row--){
                if(board[row][cc] == "Q"){
                    return false;
                }
            }

            //left diagonal
            int row = cr;
            int col = cc;
            while(row>=0 && col>=0){
                if(board[row][col] == "Q"){
                    return false;
                }
                row--;
                col--;
            }

            //right diagonal
            row = cr;
            col = cc;
            while(row >= 0 && col <board.length){
                if(board[row][col]=="Q"){
                    return false;
                }
                row--;
                col++;
            }
            return true;
        }
    }
}
