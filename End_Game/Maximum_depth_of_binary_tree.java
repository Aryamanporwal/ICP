package End_Game;

public class Maximum_depth_of_binary_tree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val , TreeNode left , TreeNode right){
            this.val= val;
            this.right = right;
            this.left = left;
        }
    }

    public int maxDepth(TreeNode root){
        return depth(root);
    }
    public int depth(TreeNode root){
        if(root == null) return 0;

        int l = 1+depth(root.left);
        int r = 1+depth(root.right);

        return Math.max(l , r);
    }
}
