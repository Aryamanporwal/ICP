package Phase_4.Week_7;

import java.util.ArrayList;
import java.util.HashMap;

public class Node_with_highest_edge_score {
    HashMap<Integer , ArrayList<Integer>> map;
    public int edgeScore(int[] edges) {
        map = new HashMap<>();
        int n = edges.length;
        for(int i = 0; i<n ; i++){
            map.put(i , new ArrayList<>());
        }
        for(int i = 0 ; i<n ; i++){
            map.get(edges[i]).add(i);
        }

       
        long min = Long.MIN_VALUE;
        int ans = -1;
        for(int key : map.keySet()){
            long score = 0;
            for(int nbrs : map.get(key)){
                score += nbrs;
            }   
            if(score > min){
                min = score;
                ans = key;
            }
        }

        return ans;
    }

}
