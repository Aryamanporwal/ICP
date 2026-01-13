package Phase_4.Week_1;
import java.util.*;
public class first_missing_positive_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }

        //har ek element ko uske index k barbar rakhenge
        for(int i = 0; i<n ; i++){
            while(nums[i] >= 1 && nums[i] <= n && nums[nums[i]-1] != nums[i]){
                int idx = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }

        for(int i =0; i<n ; i++){
            if(nums[i] != i+1){
               System.out.println(i+1);
            }
        }
        System.out.println(n+1);
        sc.close();
    }
}
