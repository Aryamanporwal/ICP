package End_Game;

public class binary_tree_max_sum_path {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val , TreeNode left , TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int diameter ;
    public int MaxPath(TreeNode root){
        diameter = Integer.MIN_VALUE;
        solve(root);
        return diameter;
    }

    public int solve(TreeNode root){
        if(root == null) return 0;

        int l = solve(root.left);
        int r = solve(root.right);

        int temp = Math.max(Math.max(l , r)+root.val , root.val);
        int ans = Math.max(temp , l+r+root.val);
        diameter = Math.max(diameter , ans);
        return temp;
    }
}
