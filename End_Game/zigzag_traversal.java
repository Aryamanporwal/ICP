package End_Game;
import java.util.*;
public class zigzag_traversal {
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

    List<List<Integer>> res ;
    public List<List<Integer>> Zigzag(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        solve(root , 0);
        return res;
    }
    public void solve(TreeNode root , int level){
        if(root == null) return;

        if(res.size() == level){
            res.add(new LinkedList<>());
        }

        if(level %2 != 0){
            res.get(level).addFirst(root.val);
        }else{
            res.get(level).add(root.val);
        }

        solve(root.left , level+1);
        solve(root.right , level+1);
    }
}
