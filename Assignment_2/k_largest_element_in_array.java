package Assignment_2;

import java.util.PriorityQueue;

public class k_largest_element_in_array {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
            for(int i = 0; i<nums.length ; i++){
                pq.add(nums[i]);
            }

            while(k-->1){
                pq.poll();
            }
            return pq.peek();
        }
    }
}
