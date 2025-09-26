package Assignment_1;

public class find_first_and_last_position_of_element_in_sorted_array {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int low = 0;
            int high = nums.length-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(nums[mid] == target){
                    int li = mid;
                    int ri = mid;
                    while(li>0 && nums[li-1]==nums[mid]){
                        li--;
                    }
                    while(ri<nums.length-1 && nums[ri+1]==nums[mid]){
                        ri++;
                    }
                    return new int[]{li , ri};
                }
                else if(target > nums[mid]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }


            return new int[]{-1,-1};

        }
    }
}
