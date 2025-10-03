package Day6_Practice;

public class remove_character {
    // User function Template for Java
    class Solution {
        // Function to remove all occurrences of the character from the string
        public void removeCharacter(StringBuilder s, char c) {
            // code here
            recur(s , c, 0);
        }
        public void recur(StringBuilder s, char c, int idx){
            if(idx >= s.length()) return;
            if(c==s.charAt(idx)) {
                s.deleteCharAt(idx);
                recur(s , c, idx);
            }
            else{
                recur(s , c, idx+1);
            }
            
        }
    }
}
