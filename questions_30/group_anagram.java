package questions_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class group_anagram {
    class Solution {
            public List<List<String>> groupAnagrams(String[] strs) {
                int n = strs.length;
                HashMap<String , List<String>> map = new HashMap<>();
                for(int i = 0  ; i<n ; i++){
                    String s = GetKey(strs[i]);
                    if(!map.containsKey(s)){
                        map.put(s , new ArrayList<>());
                    }
                    map.get(s).add(strs[i]);
                }

                List<List<String>> ll = new ArrayList<>();
                for(String key : map.keySet()){
                    ll.add(map.get(key));
                }
                return ll;
            }
            public static String GetKey(String s){
                int [] freq = new int[26];
                for(int i =0; i<s.length() ; i++){
                    char ch = s.charAt(i);
                    freq[ch-'a']++;
                }
                StringBuilder sb = new StringBuilder();
                for(int i =0 ; i<freq.length ; i++){
                    sb.append(freq[i]+" ");
                }
                return sb.toString();

            }
    }
}
