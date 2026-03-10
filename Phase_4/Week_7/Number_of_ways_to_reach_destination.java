package Phase_4.Week_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Number_of_ways_to_reach_destination {

    HashMap<Integer, ArrayList<Pair>> map; 
    int min; 

    public int countPaths(int n, int[][] roads) {
        map = new HashMap<>();
        min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < roads.length; i++) {
            int u = roads[i][0];
            int v = roads[i][1];
            int t = roads[i][2];
            map.get(u).add(new Pair(v, t));
            map.get(v).add(new Pair(u, t));
        }

        long[] dist = new long[n];
        int[] ways = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        dist[0] = 0;
        ways[0] = 1;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.time, b.time));
        pq.offer(new Pair(0, 0));

        int MOD = 1_000_000_007;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int vtx = curr.vtx;
            long time = curr.time;

            if (time > dist[vtx]) continue;

            for (Pair nbrs : map.get(vtx)) {
                int nn = nbrs.vtx;
                long t = nbrs.time;

                if (dist[vtx] + t < dist[nn]) {
                    dist[nn] = dist[vtx] + t;
                    ways[nn] = ways[vtx];
                    pq.offer(new Pair(nn, dist[nn]));
                } 
                else if (dist[vtx] + t == dist[nn]) {
                    ways[nn] = (ways[nn] + ways[vtx]) % MOD;
                }
            }
        }

        return ways[n - 1];
    }
}

class Pair {
    int vtx;
    long time;

    public Pair(int v, long t) {
        this.vtx = v;
        this.time = t;
    }

}
