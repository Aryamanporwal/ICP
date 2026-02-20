package Phase_4.Week_6;
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){}

    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode(TreeNode left , TreeNode right , int val){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
public class make_cost_of_paths_equal_in_a_BT {
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cost[] = new int[n];
        for(int i= 0 ; i<n ; i++){
            cost[i] = sc.nextInt();
        }
        ans = 0;
        TreeNode root = buildTree(n, n);
        solve(root , cost);
        System.out.println(ans);

        sc.close();
    }

    public static int solve(TreeNode root , int [] cost){
        if(root == null) return 0;

        int l = solve(root.left , cost);
        int r = solve(root.right , cost);

        int curCost = cost[root.val]-1;

        ans+= Math.abs(l-r);
        return curCost + Math.max(l , r);
    }

    public static TreeNode buildTree(int i , int n){
        if (i > n) return null;

        TreeNode root = new TreeNode(i);
        root.left = buildTree(2*i , n);
        root.right = buildTree(2*i+1 , n);

        return root;
    }
}
