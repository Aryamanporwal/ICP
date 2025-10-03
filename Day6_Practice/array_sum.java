package Day6_Practice;

public class array_sum {
    // User function Template for Java

    class Solution {
        int arraySum(int arr[]) {
            // code here
            return recur(0,0 , arr);
        }
        
        int recur(int sum,int i , int arr[]){
            if(i==arr.length) return sum;
            
            return recur(sum+arr[i] , i+1 , arr);
        }
    }

}
