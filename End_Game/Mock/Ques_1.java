package End_Game.Mock;

import java.util.*;

public class Ques_1 {
    static HashMap<Integer , ArrayList<Integer>> map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int N = sc.nextInt();
            int A[] = new int[N];
            map = new HashMap<>();
            for(int i= 0 ; i<N ; i++){
                A[i] = sc.nextInt();
                if(!map.containsKey(A[i])){
                    map.put(A[i], new ArrayList<>());
                }
                map.get(A[i]).add(i);
            }

            int max = Integer.MIN_VALUE;
            int item = Integer.MIN_VALUE;
            for(int keys : map.keySet()){
                int count = 1;
                boolean flag = false;
                for(int i = 1; i<map.get(keys).size() ;i++){
                    if(flag == true || map.get(keys).get(i-1)+1 != map.get(keys).get(i)){
                        count++;
                        flag = false;
                    }else{
                        flag = true;
                    }
                }

                if(count > max){
                    item = keys;
                    max = Math.max(count , max);
                }
            }
            

            System.out.println(item);


        }
        sc.close();
    }

}
