/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return Valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean Valid(TreeNode root,long minval,long maxval){
        if(root==null) return true;
        if(root.val>=maxval || root.val<=minval) return false;
        return Valid(root.left,minval,root.val) && Valid(root.right,root.val,maxval);
    }
}