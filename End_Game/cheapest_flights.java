package End_Game;

import java.util.*;

public class cheapest_flights {
    HashMap<Integer, HashMap<Integer , Integer>> map;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, new HashMap<>());
        }

        for(int [] f: flights){
            map.get(f[0]).put(f[1] , f[2]);
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src , 0 , 0 ));

        int []minCost = new int[n];
        Arrays.fill(minCost , Integer.MAX_VALUE);
        minCost[src] = 0;

        int ans = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            Pair rm = q.poll();

            if(rm.stops > k) continue;

            for(int nbrs : map.get(rm.vtx).keySet()){
                int newCost = rm.cost+map.get(rm.vtx).get(nbrs);
                if(newCost < minCost[nbrs]){
                    minCost[nbrs] = newCost;
                    q.add(new Pair(nbrs , newCost , rm.stops+1));
                }
            }
        }

        return minCost[dst] == Integer.MAX_VALUE ? -1 : minCost[dst];

    }

}
class Pair{
    int vtx;
    int cost;
    int stops;

    public Pair(int v , int c, int s){
        this.vtx = v;
        this.cost = c;
        this.stops = s; 
    }
}


