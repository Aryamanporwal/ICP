// import javax.swing.tree.TreeNode;

public class maximum_depth_of_binary_tree {
 public class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
    public static void main(String[] args) {
    }
    public int maxDepth(TreeNode root) {
        return depth(root);
    }
    public int depth(TreeNode root){
    if(root == null) return 0;

    int r = 1+depth(root.left);
    int l = 1+depth(root.right);

    return Math.max(r , l);
    }
}
