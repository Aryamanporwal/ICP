import java.util.ArrayList;
import java.util.HashMap;

public class count_distinct_number_in_window {
    class Solution {
        ArrayList<Integer> countDistinct(int arr[], int k) {
            // code here
            int n = arr.length;
            ArrayList<Integer> res = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i =0; i<k ; i++){
                map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
            }
            res.add(map.size());
            
            for(int i = k ; i<n; i++){
                
                int out = arr[i-k];
                map.put(out , map.get(out)-1);
                if(map.get(out)==0){
                    map.remove(out);
                }
                
                map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
                res.add(map.size());
            }
            return res;
        }
    }
}
