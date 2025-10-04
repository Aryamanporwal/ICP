package Day7_Practice;

public class word_search {
    class Solution {
        public boolean exist(char[][] board, String word) {
            //check if next character is word of character otherwise backtrack
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i<m ; i++){
                for(int j = 0; j<n ; j++){
                    if(board[i][j] == word.charAt(0)){
                        if(recur(board , i , j, 0, word)){
                            return true;
                        }
                    }
                }
        }
        return false;
        }

        public boolean recur(char [][] board , int row , int col , int idx , String word){

            if(idx == word.length()){
                return true;
            }

            if(row<0 || col<0 || row >= board.length || col >= board[0].length){
                return false;
            }

            if(board[row][col] != word.charAt(idx)){
                return false;
            }

            char temp = board[row][col];

            board[row][col] = '#';
        
            boolean found = 
            recur(board , row+1 , col , idx+1 , word)||
            recur(board , row-1 , col, idx+1 , word)||
            recur(board , row , col+1, idx+1 , word)||
            recur(board , row , col-1, idx+1 , word);
            board[row][col] = temp;
            return found;
        }
    }
}
