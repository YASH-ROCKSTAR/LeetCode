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
    public int maxPathSum(TreeNode root) {
        int[] maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        pathsum(root,maxi);
        return maxi[0];
    }
    int pathsum(TreeNode root,int maximum[]){
        if(root==null){
            return 0;
        }
        int lh=Math.max(0,pathsum(root.left,maximum));
        int rh=Math.max(0,pathsum(root.right,maximum));
        maximum[0]=Math.max(maximum[0],lh + rh + root.val);
        
        return root.val+Math.max(lh,rh);
    }
}