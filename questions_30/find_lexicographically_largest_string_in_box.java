package questions_30;

public class find_lexicographically_largest_string_in_box {
    class Solution {
        public String answerString(String word, int n) {
            if(n==1) return word;
            int len = word.length()-n+1;
            String res = "";
            for(int i = 0; i<word.length() ; i++){
                String temp;
                if((i+len)<=word.length()){
                    temp = word.substring(i , i+len);
                }
                else{
                    temp = word.substring(i);
                }
                if(temp.compareTo(res)>0){
                    res = temp;
                }
            }
            return res;
        }
    }
}
