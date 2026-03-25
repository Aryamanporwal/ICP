public class range_minimum_query {
    /* The functions which
builds the segment tree */
    static int st[];

    public static int[] constructST(int arr[], int n) {
        // Add your code here
        st = new int[n*4];
        build_tree(st , 0 , 0  , n-1 , arr);
        return st;
    }
    public static void build_tree(int [] res , int i , int l , int r , int[] nums){
        if(l == r){
            res[i] = nums[l];
            return;
        }
        
        int mid = (l+r)/2;
        build_tree(res , 2*i+1 , l , mid , nums);
        build_tree(res , 2*i+2 , mid+1 , r , nums);
        res[i] = Math.min(res[2*i+1],res[2*i+2]);
    }

    /* The functions returns the
      min element in the range
      from l and r */
    public static int RMQ(int st[], int n, int l, int r) {
        // Add your code here
        return query(st , l , r , 0 , n-1 , 0);
    }
    public static int query(int []st , int s , int e , int l , int r , int i){
        if(r < s || l > e){
            return Integer.MAX_VALUE;
        }
        
        if(l >= s && r <= e){
            return st[i];
        }
        int mid = (l+r)/2;
        return Math.min(query(st , s , e , l , mid , 2*i+1) , query(st , s , e , mid+1 , r , 2*i+2));
    }
 
}
