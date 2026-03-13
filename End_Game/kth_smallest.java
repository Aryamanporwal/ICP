package End_Game;

public class kth_smallest {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){}
        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(int val , TreeNode left , TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int res , count;

    public int kthSmallest(TreeNode root , int k){
        res = 0;
        count = 0;
        solve(root , k );
        return res;
    }

    public void solve(TreeNode root , int k ){
        if(root == null) return ;

        solve(root.left , k  );
        count++;
        if(count == k){
            res = root.val;
            return;
        }

        solve(root.right , k );

    }
}
