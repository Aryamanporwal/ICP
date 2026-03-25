import java.util.*;

public class building_where_alice_and_bob_can_meet {
    static int n;
    static int st[];
    static int ans[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        st = new int[4*n];

        sc.close();
    }
    public int [] left(int [] heights , int [][] queries){
        buildTree(0 , n-1 , 0 , heights);

        int q = queries.length;
        for(int i = 0 ; i<q ; i++){
            int u = queries[i][0];
            int v = queries[i][1];

            query(u , v , heights , i);
        }

        return ans;
    }

    public void query(int u , int v , int[] heights , int i){
        int maxIdx = Math.max(u , v);
        int minIdx = Math.min(u , v);

        if(u == v){
            ans[i] = u;
        }
        else if(heights[maxIdx] >= heights[minIdx]){
            ans[i] = maxIdx;
        }else{
            int l = maxIdx+1;
            int r = n-1;
            int result_idx = Integer.MAX_VALUE;

            while(l <= r){
                int mid = (l+r)/2;
                int idx = query(l , mid , 0 , n-1 , 0 , heights);
                if(heights[idx] > Math.max(heights[u] , heights[v])){
                    result_idx = Math.min(result_idx , idx);
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }

            if(result_idx == Integer.MAX_VALUE){
                ans[i] = -1;
            }else{
                ans[i] = result_idx;
            }
        }
    }

    public int query(int s , int e , int l , int r, int i , int [] heights){
        if(s > r || e<l) return -1;
        if(l >= s && r <= e){
            return st[i];
        }

        int mid = (l+r)/2;
        int leftIdx = query(s , e , l , mid , 2*i+1 , heights);
        int rightIdx = query(s , e , mid+1 , r , 2*i+1 , heights);

        if(leftIdx == -1){
            return rightIdx;
        }
        if(rightIdx == -1){
            return leftIdx;
        }

        if(heights[leftIdx] >= heights[rightIdx]){
            return leftIdx;
        }else{
            return rightIdx;
        } 
    }

    public void buildTree(int l , int r , int i , int [] heights){
        if(l == r){
            st[i] = l;
            return;
        }

        int mid = l+(r-l)/2;
        buildTree(l , mid , 2*i+1 , heights);
        buildTree(mid+1 , r , 2*i+2 , heights);

        st[i] = heights[st[2*i+1]] >= heights[st[2*i+2]] ? st[2*i+1] : st[2*i+2];
    }
}
