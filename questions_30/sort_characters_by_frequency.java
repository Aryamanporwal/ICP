package questions_30;

import java.util.HashMap;
import java.util.PriorityQueue;

public class sort_characters_by_frequency {
    class Solution {
        public String frequencySort(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        
        PriorityQueue<Character> pq  = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        String s1 = "";
        while(!pq.isEmpty()){
                char ch = pq.poll();
                int freq = map.get(ch);
                while(freq-->0){
                    s1 = s1+ch;
                }
        }
        return s1;
        }
    }

}
