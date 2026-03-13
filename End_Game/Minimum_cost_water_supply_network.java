package End_Game;

import java.util.*;

public class Minimum_cost_water_supply_network {
    static HashMap<String , HashMap<String , Integer>> map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        map = new HashMap<>();

        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            String s = sc.next();
            int edges = sc.nextInt();

            HashMap<String , Integer> nbrs = new HashMap<>();
                for(int j = 0 ; j< edges ; j++){
                    String nb = sc.next();
                    int wt = sc.nextInt();
                    nbrs.put(nb , wt);
                }

            map.put(s , nbrs);
        }
         
        sc.close();
    }

    public static int prims(){
        HashSet<String> visi = new HashSet<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) ->a.cost - b.cost);

        pq.offer(new Pair("plant" , 0));

        int totcost = 0;

        while(!pq.isEmpty()){
            Pair rm = pq.poll();

            if(visi.contains(rm.node)){
                continue;
            }

            visi.add(rm.node);

            totcost += rm.cost;

            for(Map.Entry<String , Integer> nbrs : map.getOrDefault(rm.node, new HashMap<>()).entrySet()){

                if(!visi.contains(nbrs.getKey())){
                    pq.offer(new Pair(nbrs.getKey() , nbrs.getValue()));
                }
            }
        }

        return totcost;
    }
}

class Pair{
    String node;
    int cost;

    Pair(String node , int cost){
        this.node = node;
        this.cost = cost;
    }
}
