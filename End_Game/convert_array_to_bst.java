package End_Game;
import java.util.*;
public class convert_array_to_bst{
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}
        public TreeNode(int val){
            this.val= val;
        }

        public TreeNode(int val , TreeNode left , TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode convert(int [] nums){

        return solve(nums , 0 , nums.length-1);
    }

    public TreeNode solve(int [] nums , int l , int r){
        if( l > r) return null;

        int mid = l + (r -l)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = solve(nums ,l , mid-1);
        root.right = solve(nums , mid+1 , r);

        return root;
    }
}