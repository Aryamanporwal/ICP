package Day8_Practice;

public class count_number_of_hops {
    class Solution {
    // Function to count the number of ways in which frog can reach the top.
    static int countWays(int n) {
        // add your code here
        return recur(0 , n);
    }
    static int recur(int sum, int n  ){
        if (sum == n) return 1; 
        if (sum > n) return 0;   

        int ways = recur(sum + 1, n) + recur(sum + 2, n) + recur(sum + 3, n);
        return ways;
    }
}
}
