package Day6_Practice;

public class reverse_string {
    class Solution {
        public void reverseString(char[] s) {
            int l = 0;
            int r = s.length-1;
            recur(l , r , s);
        }
        public void recur(int l , int r , char[] s){
            if(l>=r){
                return;
            }
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            recur(l+1 , r- 1 , s);
        }
    }
}
