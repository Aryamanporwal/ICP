package End_Game.DSU;
import java.util.*;
public class dsu{
    public static void main(String[] args) {
        
    }

    public static int find(int i , int [] parent){
        if(i == parent[i]) return i;

        return parent[i] = find(parent[i] , parent);

    }

    public static void union(int x , int y , int [] parent , int [] rank){
        int x_parent = find(x , parent);
        int y_parent = find(y , parent);

        if(x_parent == y_parent) return;

        else if(x_parent != y_parent){
            if(rank[x_parent] > rank[y_parent]){
                parent[y_parent] = x_parent;
            }else if(rank[y_parent] > rank[x_parent]){
                parent[x_parent] = y_parent;
            }else{
                parent[x_parent] = y_parent;
                rank[y_parent]++;
            }
        }
    }
}