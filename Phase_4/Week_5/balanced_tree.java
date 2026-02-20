package Phase_4.Week_5;

public class balanced_tree {
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
      public boolean isBalanced(TreeNode root) {
        //balanced = |rh-lh| <= 1
        return ht(root) != -1;
    }
    public int ht(TreeNode root){
        if(root == null) return 0;
        int rt = ht(root.right);
        if(rt == -1){
            return -1;
        }

        int lt = ht(root.left);
        if(lt == -1){
            return -1;
        }

        if(Math.abs(rt - lt) > 1){
            return -1;
        }

        return 1+Math.max(rt , lt);
    }
}
