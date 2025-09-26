package Day1_Practice;

public class majority_elements {
    class Solution {
        public int majorityElement(int[] nums) {
            int c = nums[0];
            int v =1 ;
            for(int i = 1 ;i<nums.length ; i++){
                if(nums[i]==c){
                    v++;
                }else{
                    v--;
                    if(v==0){
                        c = nums[i];
                        v = 1;
                    }
                }
            }
            return c;
        }
    }
}
