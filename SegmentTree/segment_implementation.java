import java.util.*;

public class segment_implementation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        int res[] = new int[2*n];
        create_tree(res , 0 , 0 , n-1  , nums);

        for(int i = 0 ; i<res.length ; i++){
            System.out.print(res[i]+" ");
        }
        int idx_update = sc.nextInt();
        int val_update = sc.nextInt();
        update_tree(res , 0 , 0 , n-1 , idx_update , val_update);
        System.out.println();
        for(int i = 0 ; i<res.length ; i++){
            System.out.print(res[i]+" ");
        }

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

    public static void update_tree(int []res , int i , int l , int r , int idx , int val){
        //base case
        if(l == r && l == idx){
            res[i] = val;
            return;
        }

        int mid = (l+r)/2;
        if(idx <= mid){
            update_tree(res , 2*i+1 , l , mid , idx , val);
        }else{
            update_tree(res , 2*i+2 , mid+1 , r , idx , val);
        }

        res[i]  = res[2*i+1]+res[2*i+2];
    }
}