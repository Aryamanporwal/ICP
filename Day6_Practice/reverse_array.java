package Day6_Practice;

public class reverse_array {
    class Solution {
        public void reverseArray(int arr[]) {
            // code here
            int l = 0;
            int r = arr.length-1;
            recur(l , r, arr);
        }
        public void recur(int l , int r, int[] arr){
            if(l>=r) return;
            
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            
            recur(l+1 , r-1 , arr);
        }
    }
}
