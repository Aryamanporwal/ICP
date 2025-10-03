package Day6_Practice;

public class palindrome_string {
    class Solution {
        boolean isPalindrome(String s) {
            // code here
            int l = 0;
            int r = s.length()-1;
            return isPalin(l,r,s);
        }
        boolean isPalin(int l , int r , String s){
            if(s.charAt(l) != s.charAt(r) ) return false;
            if(l>=r) return true;
            return isPalin(l+1 , r-1 , s);
        }
    }
}
