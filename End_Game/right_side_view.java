package End_Game;
import java.util.*;
public class right_side_view {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}
        public TreeNode (int val){
            this.val = val;
        }
        public TreeNode(int val ,TreeNode left , TreeNode right){
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }

    public List<Integer> rightView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        solve(root , 1 , res);
        return res;
    }
    int maxDepth = 0;
    public void solve(TreeNode root , int currlvl , List<Integer> res){
        if(root == null) return;

        if(maxDepth < currlvl){
            res.add(root.val);
            maxDepth = currlvl;
        }

        solve(root.right , currlvl+1 , res);
        solve(root.left , currlvl+1 , res);
    }
}
