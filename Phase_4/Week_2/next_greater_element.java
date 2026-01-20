package Phase_4.Week_2;
import java.util.*;
public class next_greater_element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nums1[] = new int[n];
        int nums2[] = new int[m];
        for(int i = 0 ; i<n ; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i =0; i<m ; i++){
            nums2[i] = sc.nextInt();
        }
        nextGreaterElement(nums1, nums2);
        sc.close();

    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [][] ans = ng(nums2);
        int [] res= new int[nums1.length];
        for(int i = 0; i<nums1.length ; i++){
            for(int j = 0 ; j<nums2.length ; j++){
                if(ans[j][0] == nums1[i]){
                    res[i] = ans[j][1];
                }
            }
        }
        return res;
    }
    public static int[][] ng(int[] nums2){
        int n = nums2.length;
        int [][] ans = new int[n][2];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<nums2.length ; i++){
            while(!st.isEmpty() && nums2[st.peek()] < nums2[i]){
                ans[st.peek()][0] = nums2[st.peek()];
                ans[st.peek()][1] = nums2[i]; 
                st.pop();
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            ans[st.peek()][0] = nums2[st.peek()];
            ans[st.peek()][1] = -1;
            st.pop(); 
        }

        return ans;
    }
}
