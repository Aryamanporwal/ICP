package Phase_4.Week_7;
import java.util.*;
public class Find_if_path_exists {

    HashMap<Integer, ArrayList<Integer>> map;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        map = new HashMap<>();
        for(int i =0 ; i<n ; i++){
            map.put(i , new ArrayList<>());
        }

        for(int i= 0; i<edges.length ; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            map.get(u).add(v);
            map.get(v).add(u);
        }

        return hasPath(source , destination);

    }

    public boolean hasPath(int src , int des){
        Stack<Integer> st = new Stack<>();
        st.push(src);
        HashSet<Integer> vis = new HashSet<>();
        while(!st.isEmpty()){
            int rm = st.pop();

            if(vis.contains(rm)) continue;

            vis.add(rm);

            if(rm == des) return true;

            for(int nbrs : map.get(rm)){
                if(!vis.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }

        return false;
    }

}
