import java.util.*;
public class maximum_sum_subarray {
    class Solution {
        public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
            // code here
            int n = arr.length;
            ArrayList<Integer> res = new ArrayList<>();
            Deque<Integer> dq = new ArrayDeque<>();
            for(int i= 0; i<k ; i++){
                //remove those elements which are less then equal to current
                while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                    dq.removeLast();
                }
                dq.addLast(i);
            }
            
            for(int i = k ; i<n ; i++){
                res.add(arr[dq.peekFirst()]);
                    
                //remove those elements from first which are not part of current window
                while(!dq.isEmpty() && dq.peekFirst() < i-k+1){
                    dq.removeFirst();
                }
                
                //remove those elements from back which are less then current element
                while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                    dq.removeLast();
                }
                
                dq.addLast(i);
                
            }
            res.add(arr[dq.peekFirst()]);
            
            return res;
            
        }
    }
}
