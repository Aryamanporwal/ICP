package End_Game;

public class diameter_of_bt {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {};
        TreeNode(int val){ this.val = val;}
        TreeNode(int val , TreeNode left , TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

        int res;
        public int diameter(TreeNode root){
            res = Integer.MIN_VALUE;
            solve(root);
            return res-1;
        }

        public int solve(TreeNode root){
            if(root == null) return 0;

            int l = solve(root.left);
            int r = solve(root.right);

            int temp = Math.max(l , r)+1; //height
            int ans = Math.max(temp , l+r+1); //current root node
            res = Math.max(res , ans); //maximum diameter formula
            return temp; 
        }


    }
    int diameter = 0;
    public int height(TreeNode root){
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter , left+right);

        return Math.max(left , right)+1;
    }
    
}
