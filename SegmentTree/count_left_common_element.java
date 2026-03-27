import java.util.HashMap;

public class count_left_common_element {
    int n;
    long []st;
    public long[] leftCommonCount(int [] nums1 , int [] nums2){
        n = nums1.length;
        st = new long[4*n];
        
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i =0 ; i<n ; i++)
            map.put(nums2[i] , i);

        long res[] = new long[n];
        update(0 , n-1 , 0 , 0);
        res[0] = 0;

        for(int i = 1 ; i<n ; i++){
            int idx = map.get(nums1[i]);
            long leftCommonCount = query(0 , idx , 0 , n-1 , 0);
            res[i] = leftCommonCount;

            update(0 , n-1 , 0 , idx);
        }   

        return res;


    }

    public void update(int l , int r , int i , int idx){
        if(l == r){
            st[i] = 1;
            return;
        }

        int mid = (l+r)/2;
        if(idx <= mid){
            update(l , mid , 2*i+1 , idx);
        }
        else{
            update(mid+1 , r, 2*i+2 , idx);
        }

        st[i] = st[2*i+1]+st[2*i+2];
    }

    public long query(int s , int e, int l , int r, int i){
        if(e < r || s > l) return 0;

        if(l >= s && r <= e) {
            return st[i];
        }

        int mid = (l+r)/2;
        long left = query(s , e , l , mid , 2*i+1);
        long right = query(s , e, mid+1 , r , 2*i+2);

        return left+right;
    }
}
