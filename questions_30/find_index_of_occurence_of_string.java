package questions_30;

public class find_index_of_occurence_of_string {
    class Solution {
    public int strStr(String s, String k) {
        int len = k.length();
        for(int i = 0 ; i<s.length() ; i++){
            int j = i+len;

            if(j>s.length()){
                break;
            }

            if(s.substring(i,j).equals(k)){
                return i;
            }
        }
        return -1;
        
    }
}
}
