package Day11_Practice;
import java.util.*;
public class sequence_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int b[] = new int[n];
            for(int i = 0; i<n ; i++){
                b[i] = sc.nextInt();
            }
            
            ArrayList<Integer> a = new ArrayList<>();
            a.add(b[0]);
            for(int i = 1 ; i<n ; i++){
                if(b[i-1] > b[i]){
                    a.add(b[i]);
                    a.add(b[i]);
                }else{
                    a.add(b[i]);
                    continue;
                }
            }

            int size = a.size();
            System.out.println(size);
            for(int i = 0; i<size-1 ; i++){
                System.out.print(a.get(i)+" ");
            }

            System.out.println(a.get(size-1));
        }
        sc.close();
    }
}
