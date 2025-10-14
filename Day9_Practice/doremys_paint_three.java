package Day9_Practice;
import java.util.*;
public class doremys_paint_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i<n ; i++){
                a[i] = sc.nextInt();
            }
            HashMap<Integer , Integer> map = new HashMap<>();
            for(int i = 0 ; i<n ; i++){ 
                map.put(a[i] , map.getOrDefault(a[i] , 0)+1);
            }

            if(map.size()==1){
                System.out.println("YES");
            }
            else if(map.size()==2){
                List<Integer> count = new ArrayList<>(map.values());
                int c1 = count.get(0);
                int c2 = count.get(1);
                if(Math.abs(c1 - c2) <=1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }

        }
    }
}
