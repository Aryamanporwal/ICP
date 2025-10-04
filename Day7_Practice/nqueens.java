package Day7_Practice;

import java.util.*;

public class nqueens {
    List<List<String>> res = new ArrayList<List<String>>();
    public List<List<String>> solveNQueens(int n) {
        String arr[][] = new String[n][n];
        for(String ar[] : arr){
            Arrays.fill(ar, ".");
        }
        queens(0, arr , n);
        return res;
    }

    public void queens(int cr , String [][] board , int n){
        if(cr==n){
            List<String> ll = new ArrayList<>();
            for(int i = 0; i<n ; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j<n ; j++){
                    sb.append(board[i][j]);
                }
                ll.add(sb.toString());
            }
            res.add(ll);
            return ;
        }

        for(int cc = 0; cc<n ; cc++){
            if(isPossible(cc , cr , board)){
                board[cr][cc] = "Q";
                queens(cr+1 , board , n);
                board[cr][cc] = ".";
            }
        }


    }

    public boolean isPossible(int cc , int cr , String[][] board){
        //upper
        for(int row = cr; row>=0 ; row--){
            if(board[row][cc] == "Q") return false;
        }

        //left diagonal
        int row = cr;
        int col = cc;
        while(row>=0 && col >= 0){
            if(board[row][col] == "Q") return false;
            row--;
            col--;
        }

        row = cr;
        col = cc;
        while(row>=0 && col <board.length){
            if(board[row][col] == "Q") return false;
            row--;
            col++;
        }
        return true;
    }
}
