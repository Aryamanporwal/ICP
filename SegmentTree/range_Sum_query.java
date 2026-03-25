import java.util.Scanner;

public class range_Sum_query {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        int res[] = new int[2*n];
        create_tree(res , 0 , 0 , n-1  , nums);

        
        sc.close();

    }
    public static void create_tree(int res[] , int i , int l , int r , int [] nums){
        //base case
        if(l == r){
            res[i] = nums[l];
            return;
        }

        int mid = (l+r)/2;
        create_tree(res , 2*i+1 , l , mid , nums);
        create_tree(res , 2*i+2 , mid+1 , r , nums);
        res[i] = res[2*i+1]+res[2*i+2];
    }
    public static int query(int []res ,int i ,  int s , int e , int l , int r){
        if(r<s || l>e){
            return 0;
        }

        if(l >= s && r <= e){
            return res[i];
        }

        int mid = (l+r)/2;
        return query(res, 2*i+1, s, e, l, mid)+ query(res, 2*i+2, s, e, mid+1, r);
    }
}
