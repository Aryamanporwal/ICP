package Day2_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class sort_characters_by_frequency {
    class Solution {
        public String frequencySort(String s) {
            int l = s.length();
            Map<Character, Integer> hm = new HashMap<>();


            for (int i = 0; i < l; i++) {
                char c = s.charAt(i);
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }


            PriorityQueue<Character> pq = new PriorityQueue<>(
                (a, b) -> hm.get(b) - hm.get(a)
            );
            pq.addAll(hm.keySet());


            StringBuilder sb = new StringBuilder();
            while (!pq.isEmpty()) {
                char c = pq.poll();
                int freq = hm.get(c);
                for (int i = 0; i < freq; i++) {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }

}
