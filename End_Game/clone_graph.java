package End_Game;
import java.util.*;
public class clone_graph {

    class Node{
        public int val;
        public List<Node> neighbours;
        public Node(){
            val = 0;
            neighbours = new ArrayList<>();
        }

        public Node(int _val){
            val = _val;
            neighbours = new ArrayList<Node>();
        }

        public Node(int _val , ArrayList<Node> _neighbours){
            val = _val;
            neighbours = _neighbours;
        }
    }

    public Node clone(Node node){
        if(node == null) return null;
        HashMap<Node , Node> map = new HashMap<>();

        Queue<Node> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        q.add(node);
        Node nn = new Node(node.val);
        map.put(node , nn);
        while(!q.isEmpty()){
            Node rv = q.poll();

            if(visited.contains(rv.val)){
                continue;
            }

            visited.add(rv.val);

            Node clonedNode = map.get(rv);

            for(Node nbrs : rv.neighbours){
                if(!map.containsKey(nbrs)){
                    map.put(nbrs , new Node(nbrs.val));
                }
                clonedNode.neighbours.add(map.get(nbrs));

                if(!visited.contains(nbrs.val)){
                    q.add(nbrs);
                }
            }
        }

        return nn;
    }
}
