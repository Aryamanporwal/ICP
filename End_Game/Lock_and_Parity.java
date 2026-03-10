package End_Game;
import java.util.*;
public class Lock_and_Parity {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int locks [] = new int[N];
    for(int i = 0 ; i<N ; i++){
        locks[i] = sc.nextInt();
    }

    List<Edges> edges = new ArrayList<>();

    for(int j = 1 ; j<= N ; j++){
        for(int i = j+1 ; i<=N ; i++){

            if(locks[j] != locks[i]){

                int cost = Math.abs(locks[j] - locks[i]);
                edges.add(new Edges(i , j , cost));
            }
        }
    }

    int min = Integer.MAX_VALUE;

    for(Edges e : edges){
        if(e.even){
            min = Math.min(min , e.cost);
        }
    }

    if(min == Integer.MAX_VALUE){
        System.out.println(-1);
    }else{
        System.out.println(min);
    }

        sc.close();
   } 

}

class Edges{
    int u , v, cost;
    boolean even;

    Edges(int u , int v , int cost){
        this.u = u;
        this.v = v;
        this.cost = cost;
        this.even = (cost % 2 == 0);
    }
}
