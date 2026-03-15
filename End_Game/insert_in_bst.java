package End_Game;

public class insert_in_bst {
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
            this.right = right;
            this.left = left;
        }
    }

    public TreeNode insert(TreeNode root , int val){
        if(root == null){
            root = new TreeNode(val);
        }
        solve(root , val);
        return root;
    }
    public TreeNode solve(TreeNode root , int val){
        if(root == null) return root;

        if(val < root.val){
            if(root.left == null){
                root.left = new TreeNode(val);
                return root;
            }
            else{
                solve(root.left , val);
            }
        }
        else if(val > root.val){
            if(root.right == null){
                root.right = new TreeNode(val);
                return root;
            }
            else{
                solve(root.right , val);
            }
        }

        return root;
    }
}
