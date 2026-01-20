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
    //function to find the array of nums
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); //ans List
        int n = nums.length;
        Arrays.sort(nums); //sorting to apply binary search on left sum 
        for(int i = 0 ; i<n ; i++){ //iterating the array
            if(i>0 && nums[i-1] == nums[i]) continue; //if an element is occured two times than only one time will be considered
            int j = i+1; //search if we can take other element in sum from i+1;
            int k = nums.length-1; // pointer to search from last
            while(j<k){
                int tot = nums[i]+nums[j]+nums[k]; //sum of elements of array
                if(tot>0){ //If sum > 0 
                    k--; //decrease the largest pointer
                }else if(tot<0){ //if sum < 0
                    j++; //increase the lower pointer
                }else{
                    ans.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j<k){ //increase the pointer if two elements are same
                        j++;
                    }
                }
            }
        }
        return ans;
    }
}
