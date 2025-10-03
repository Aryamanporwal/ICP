import java.util.HashMap;

public class minimum_sliding_substring {
    class Solution {
        public String minWindow(String s, String t) {
            HashMap<Character , Integer> freq = new HashMap<>();
            for(int i = 0 ; i < t.length() ; i++){
                char ch = t.charAt(i);
                freq.put(ch , freq.getOrDefault(ch , 0) + 1);
            }

            int unichar = freq.size();   // unique chars to match
            int startIndex = -1;
            int windowstart = 0;
            int windowend = 0;
            int minLen = Integer.MAX_VALUE;
            int N = s.length();

            while(windowend < N){

                // expand window
                char ch = s.charAt(windowend);
                if(freq.containsKey(ch)){
                    freq.put(ch , freq.get(ch) - 1);
                    if(freq.get(ch) == 0){
                        unichar--;
                    }
                }

                // shrink window if valid
                while(unichar == 0){
                    // update result
                    int len = windowend - windowstart + 1;
                    if(len < minLen){
                        minLen = len;
                        startIndex = windowstart;
                    }

                    char leftChar = s.charAt(windowstart);
                    if(freq.containsKey(leftChar)){
                        freq.put(leftChar , freq.get(leftChar) + 1);
                        if(freq.get(leftChar) > 0){
                            unichar++;
                        }
                    }
                    windowstart++;
                }

                windowend++;
            }

            if(startIndex == -1){
                return "";
            }

            return s.substring(startIndex , startIndex + minLen);
        }
    }

}
