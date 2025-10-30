import java.util.*;
public class isamatdin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc --> 0){
           int n = sc.nextInt();
           int nums[] = new int[n];
           for(int i =0; i<n ; i++){
            nums[i] = sc.nextInt();
           }
            boolean hasEven = false, hasOdd = false;
            for (int x : nums) {
                if (x % 2 == 0) hasEven = true;
                else hasOdd = true;
            }

            // If both exist → full sort possible
            if (hasEven && hasOdd) {
                Arrays.sort(nums);
            }

            for(int i = 0 ; i<n-1 ; i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println(nums[n-1]);
        }
        sc.close();
    }
}
