package questions_30;

public class remove_duplicates_from_sorted_Array {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int n = nums.length;
            if(n==0){
                return 0;
            }
            int j = 1;
            for(int i = 0 ;i<n ; i++){
                if(nums[i] != nums[j-1]){
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;
        }
    }
}
