package End_Game;

public class delete_node {
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

    public TreeNode delete(TreeNode root , int key){
        if(root == null) return null;

        if(root.val < key){
            root.right = delete(root.right, key);
        }else if(root.val > key){
            root.left = delete(root.left , key);
        }else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else{
                int min = min(root.right);
                root.right = delete(root.right , min);
                root.val = min;
            }
        }
        return root;
    }

    public int min(TreeNode root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int min = min(root.left);
        return Math.min(min , root.val);
    }

}
