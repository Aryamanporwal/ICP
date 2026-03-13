package End_Game;

public class path_sum {
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

    public boolean solve(TreeNode root , int targetSum){
        return hasPath(root , targetSum , 0);
    }
    public boolean hasPath(TreeNode root , int targetSum , int currSum){
        if(root == null) return false;

        if(root.left == null && root.right == null){
            if(currSum+root.val == targetSum)
                return true;
            else{
                currSum -= root.val;
                return false;
            }
        }

        boolean left = hasPath(root.left , targetSum , currSum+root.val);
        boolean right = hasPath(root.right, targetSum, currSum+root.val);

        return left || right;
    }
}
