package Day7_Practice;

public class valid_sudoko {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            for(int i = 0; i<board.length ; i++){
                for(int j = 0; j<board[0].length ; j++){
                    if(board[i][j] != '.'){
                        char ch = board[i][j];
                        if(isItSafe(j, i, board , ch) == false){
                            return false;
                        }
                    }
                }
            }
            return true;
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
