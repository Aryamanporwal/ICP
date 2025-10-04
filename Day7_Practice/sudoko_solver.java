package Day7_Practice;

public class sudoko_solver {
    class Solution {
        public void solveSudoku(char[][] board) {

            findsudoko(board , 0 , 0);
        }
        public boolean findsudoko(char [][] board , int row , int col){
            if(row == 9){
                return true;
            }
            int nextRow = row , nextCol = col+1;

            if(col+1 == 9){
                nextRow++;
                nextCol = 0;
            }

            if(board[row][col]!='.'){
                findsudoko(board, nextRow , nextCol);
            }
            
            for(int val = 1; val<=9 ; val++){
                char ch = (char)(val+'0');
                if(isItSafe(nextCol, val, board, ch)){
                    board[row][col] = ch;
                    findsudoko(board, nextRow, nextCol);
                    board[row][col] = '.';
                }
            }
            return false;
        }

        public boolean isItSafe(int cc , int cr  , char[][] board , char val){
            //iterate through rows
            for(int col = 0 ; col<9 ; col++){
                if(col!=cc && board[cr][col]==val){
                    return false;
                }
            }

            // iterate through column
            for(int row = 0; row<9 ; row++){
                if(row!=cr && board[row][cc] == val){
                    return false;
                }
            }

            //iterate in 3*3 matrix sudoko

            int startrow = (cr/3)*3;
            int startcol = (cc/3)*3;
            for(int i = startrow ; i<startrow+3; i++){
                for(int j = startcol ; j<startcol+3 ; j++){
                    if((i != cr || j != cc) && board[i][j] == val){
                        return false;
                    }
                }
            } 

            return true;
            
        }
    }
}
