package Phase_4.Week_1;
import java.util.*;

public class three_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i =0 ; i<n ; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(threeSum(num));
        sc.close();

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i<n ; i++){
            if(i>0 && nums[i-1] == nums[i]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int tot = nums[i]+nums[j]+nums[k];
                if(tot>0){
                    k--;
                }else if(tot<0){
                    j++;
                }else{
                    ans.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
        return ans;
    }
}
