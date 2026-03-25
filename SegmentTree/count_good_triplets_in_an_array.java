import java.util.HashMap;

public class count_good_triplets_in_an_array {
      int n ;
    long[] st;
    public long goodTriplets(int[] nums1, int[] nums2) {
        n = nums1.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            map.put(nums2[i] , i);
        }
        
        st = new long[4*n];
        long res = 0;
        update(0 , 0 , n-1 , map.get(nums1[0]));


        for(int i = 1 ; i<n ; i++){
            int idx = map.get(nums1[i]);
            long leftCommonCount = query(0 , idx , 0 , n-1 , 0);
            long leftNonCommonCount = i - leftCommonCount;
            long eleAfterIdxInNums2 = (n-1)-idx;
            long rightCommonCount = eleAfterIdxInNums2 - leftNonCommonCount;

            res += leftCommonCount*rightCommonCount;
            update(0 , 0 , n-1 , idx);
        }

        return res;

    }

    public void update(int i , int l , int r , int idx){
        if(l == r){
            st[i] = 1;
            return;
        }

        int mid = l+(r-l)/2;
        if(idx <= mid){
            update(2*i+1 , l , mid , idx);
        }
        else{
            update(2*i+2 , mid+1 , r , idx);
        }

        st[i] = st[2*i+1]+st[2*i+2];
    }

    public long query(int s , int e , int l , int r , int i){
        if(e < l || s > r) return 0;

        if(l >= s && r <= e){
            return st[i];
        }

        int mid = l+(r-l)/2;
        long left = query(s , e, l , mid , 2*i+1);
        long right = query(s , e, mid+1 , r, 2*i+2);

        return left+right;
    }
 
}
