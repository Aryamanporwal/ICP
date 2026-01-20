package Phase_4.Week_2;
import java.util.*;
public class help_classmates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; arr[i++] = sc.nextInt());
        help_classmate(arr, n);
        sc.close();
    }
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[n];
        for(int i = 0; i<arr.length ; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;
    }
}
