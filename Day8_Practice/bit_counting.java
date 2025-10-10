package Day8_Practice;

class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        int l = 1;
        for(int i = 1 ; i<n+1 ; i++){
            if(l*2 == i){
                l = i;
            }
            ans[i] = ans[i-l]+1;
        }
        return ans;
    }
}
