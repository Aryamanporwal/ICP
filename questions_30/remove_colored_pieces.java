package questions_30;

public class remove_colored_pieces {
    class Solution {
    public boolean winnerOfGame(String colors) {
        // alice can remove 'A' if both its neighbours are also 'A'
        // bob can remove 'B' if both its neighbours are also 'B'
        // cannot remove from the edge of the line
        // if a player cannot move on their turn then that player looses
        int n  = colors.length();
        int alice = 0;
        int bob = 0;
        if(n<=2 ) return false;
        for(int i = 1; i< n-1 ; i++){
            if(colors.charAt(i-1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i+1)){
                if(colors.charAt(i) == 'A') alice++;
                else bob++;
            }
        }
        return alice-bob>=1;
    }
}
}
