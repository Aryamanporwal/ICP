package End_Game;
import java.util.*;
public class path_sum2 {
    public class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
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
    List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root , int targetSum){
        res = new ArrayList<>();
        solve(root , targetSum , 0 , new ArrayList<>());
        return res;
    }

    public void solve(TreeNode root , int targetSum , int currSum , List<Integer> ans){
        if(root == null) return;

        ans.add(root.val);

        if(root.left == null && root.right == null){
            if(currSum+root.val == targetSum){
                res.add(new ArrayList<>(ans));
            }
        }
        else{
            solve(root.left , targetSum , currSum+root.val , ans);
            solve(root.right , targetSum , currSum+root.val , ans);
        }

        ans.remove(ans.size()-1);
    }
}
