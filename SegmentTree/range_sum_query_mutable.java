import java.util.*;
public class range_sum_query_mutable {
    int n;
    int st[];

    public void NumArray(int[] nums) {
        n = nums.length;
        st = new int[4*n];
        buildTree(0 , n-1 , 0 , nums);
    }

    public void update(int index, int val){
        update(index , val , 0 , n-1 , 0);
    }
    
    public void update(int index, int val, int l , int r , int i) {
        if(l == r){
            st[i] = val;
            return;
        }

        int mid = (l+r)/2;
        if(index <= mid){
            update(index , val , l , mid , 2*i+1);
        }else{
            update(index , val , mid+1 , r , 2*i+2);
        }

        st[i] = st[2*i+1] + st[2*i+2];
    }

    public int sumRange(int left , int right){
        return sumRange(left , right , 0 , n-1 , 0);
    }
    
    public int sumRange(int left, int right , int l , int r , int i) {
        if(left > r || right < l) {
            return 0;
        }

        if(l >= left && r <= right){
           return st[i];
        }

        int mid = (l+r)/2;
        return sumRange(left , right , l , mid , 2*i+1) + sumRange(left , right , mid+1 , r , 2*i+2);
    }

    public void buildTree(int l , int r , int i  , int [] nums){
        if(l == r){
            st[i] = nums[l];
            return;
        }

        int mid = (l+r)/2;
        buildTree(l , mid , 2*i+1 , nums);
        buildTree(mid+1 , r , 2*i+2 , nums);

        st[i] = st[2*i+1]+st[2*i+2];
    }

}
