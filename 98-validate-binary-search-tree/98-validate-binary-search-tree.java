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
        if(root==null){
            return true;
        }
        boolean left=isValidBST(root.left);
        boolean right=isValidBST(root.right);
        long max=max(root.left);
        long min=min(root.right);
        if(left && right &&(root.val>max && root.val<min)){
            return true;
        }
        return false;
    }
    public long max(TreeNode root){
        if(root==null){
            return Long.MIN_VALUE;
        }
        long max=max(root.right);
        return Math.max(max,root.val);
    }
    public long min(TreeNode root){
        if(root==null){
            return Long.MAX_VALUE;
        }
        long min=min(root.left);
        return Math.min(min,root.val);
    }
}