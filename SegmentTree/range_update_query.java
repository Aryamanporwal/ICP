import java.util.Scanner;

public class range_update_query {
    static int st[];
    static int arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        st = new int[4*n];
        sc.close();
    }
    public static void buildTree(int i , int l , int r){
        if(l == r){
            st[i] = arr[l];
            return;
        }

        int mid = l+(r-l)/2;
        buildTree(2*i+1, l, mid);
        buildTree(2*i+2, mid+1, r);

        st[i] = st[2*i+1]+st[2*i+2];
    }

    public static void updateQuery(int start , int end , int r , int l ,int val, int i , int [] lazy){
        if(lazy[i] != 0){
            st[i] += ((r-l)+1)*lazy[i];
            if(l != r){
                lazy[2*i+1] += lazy[i];
                lazy[2*i+2] += lazy[i];
            }

            lazy[i] = 0;
        }


        if(start > r || end < l){
            return;
        }

        if(start >= l && end <= r){
            st[i] += (r-l+1) * val;
            if(l!=r){
                lazy[2*i+1] += val;
                lazy[2*i+2] += val;
            }

            return;
        }

        int mid = (l+r)/2;

        updateQuery(start, end, mid, l, val, 2*i+1, lazy);
        updateQuery(start, end, mid+1,r, val, 2*i+2, lazy);

        st[i] = st[2*i+1]+st[2*i+2];
    }
}
