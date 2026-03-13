package End_Game;
import java.util.*;
public class binary_level_order{
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
    List<List<Integer>> res;
    public List<List<Integer>> level(TreeNode root){
        res = new ArrayList<>();
        if(root == null) return res;
        traverse(root , 0);
        return res;
    }
    public void traverse(TreeNode root , int level){
        if(root == null) return;

        if(res.size() == level){
            res.add(new ArrayList<>());
        }

        res.get(level).add(root.val);
        traverse(root.left , level+1);
        traverse(root.right , level+1);
    }
}