package questions_30;

public class wildcard_matching {
    class Solution {
        public boolean isMatch(String s, String p) {
            int slen = s.length();
            int plen = p.length();
            int i = 0, j = 0;
            int startidx = -1;
            int match = 0;

            while(i<slen){

                if(j<plen && ((s.charAt(i) == p.charAt(j)) || (p.charAt(j) == '?'))){
                    i++;
                    j++;
                }
                else if(j<plen && p.charAt(j)=='*'){
                    startidx = j;
                    match = i;
                    j++;
                }else if(startidx!=-1){
                    j = startidx+1;
                    match++;
                    i = match;
                }else{
                    return true;
                }
            }

            while(j<plen && p.charAt(j)=='*'){
                j++;
            }

            return plen == j;
        }
    }
}
