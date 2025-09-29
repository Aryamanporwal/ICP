import java.util.ArrayList;

public class merge_two_2D_array_summation {
    class Solution {
        public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
            ArrayList<int[]> arr = new ArrayList<>();
            int len1 = nums1.length;
            int len2 = nums2.length;
            int i = 0;
            int j = 0;
            while(i<len1 && j<len2){
                if(nums1[i][0]==nums2[j][0]){
                    arr.add(new int[]{nums1[i][0], nums1[i][1]+nums2[j][1]});
                    i++;
                    j++;
                }else if(nums1[i][0]<nums2[j][0]){
                    arr.add(new int[]{nums1[i][0], nums1[i][1]});
                    i++;
                }else{
                    arr.add(new int[]{nums2[j][0], nums2[j][1]});
                    j++;
                }
            }

            while(i<len1){
                arr.add(new int[]{nums1[i][0] , nums1[i][1]});
                i++;
            }
            while(j<len2){
                arr.add(new int[]{nums2[j][0] , nums2[j][1]});
                j++;
            }
            int len = arr.size();
            int res[][] = new int[len][2];
            for(int k = 0 ; k<len; k++){
                res[k] = arr.get(k);
            }
            return res;
        }
    }
}
