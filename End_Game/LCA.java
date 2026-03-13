package End_Game;

public class LCA {
    public class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        public TreeNode(){}
        public TreeNode(int val){
            this.val= val;
        }
        public TreeNode(int val , TreeNode right , TreeNode left){
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root , TreeNode p , TreeNode q){
        if(root == null || root == p || root == q){
             return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null){
            return right;
        }
        else if(right == null){
            return left;
        }
        else{
            return root;
        }
    }
}
