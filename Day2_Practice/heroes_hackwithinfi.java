package Day2_Practice;
import java.util.*;
public class heroes_hackwithinfi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //number of villians
        int M = sc.nextInt(); //number of heroes
        int H = sc.nextInt(); //health of heroes
        int []Villian = new int[N];
        for(int i = 0 ; i<N ; i++){
            Villian[i] = sc.nextInt();
        }
        int []Hero = new int[M];
        for(int i = 0; i<M ; i++){
            Hero[i] = H;
        }


        //last wale se khelna shuru kre toh?

        //win - villian sare khatam
        //hero , win - dono khatam


        for(int i = N-1; i>=0 ; i--){
            for(int j = 0 ; j<M ; j++){
                
            }
        }



    }
}
