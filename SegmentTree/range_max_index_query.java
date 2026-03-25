import java.util.Scanner;

public class range_max_index_query {
    static int n;
    static int st[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        st = new int[4*n];
        int a[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        buildTree(0 , 0 , n-1 , a);
        System.out.println(rangeMax(0, n-1, 0, n-1, 0, a));
        sc.close();
    }

    public static void buildTree(int i , int l , int r, int []nums){
        if(l == r){
            st[i] = l;
            return;
        }

        int mid = l+(r-l)/2;
        buildTree(2*i+1, l, mid , nums);
        buildTree(2*i+2, mid+1, r , nums);

        int leftMax = st[2*i+1];
        int rightMax = st[2*i+2];

        if(nums[leftMax] >= nums[rightMax]){
            st[i] = leftMax;
        }else{
            st[i] = rightMax;
        }
    }

    public static int rangeMax(int start , int end , int l , int r , int i , int nums[]){
        if(end < l || start > r){
            return -1;
        }

        if(l >= start && r <= end){
            return st[i];
        }

        int mid = (l+r)/2;
        int leftMax = rangeMax(start, end, l, mid, 2*i+1, nums);
        int rightMax = rangeMax(start, end, mid+1, r, 2*i+2, nums);

        if(nums[leftMax] >= nums[rightMax]){
            return leftMax;
        }else{
            return rightMax;
        }
    }
}
