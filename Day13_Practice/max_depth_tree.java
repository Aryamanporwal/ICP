public class max_depth_tree {
    public static void main(String[] args) {
        
    }
    public int maxDepth(TreeNode root) {
            return md(root);
        }
        private int md(TreeNode root){
            if(root == null) return 0;
            int ld = md(root.left);
            int rd = md(root.right);
            return Math.max(ld, rd)+1;
        }
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
}
