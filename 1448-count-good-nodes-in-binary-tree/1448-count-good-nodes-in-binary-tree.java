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
    int count=0;
    public int goodNodes(TreeNode root) {
        coun(root,root.val);
        return count;
    }
    public void coun(TreeNode root,int max){
        if(root!=null){
            if(root.val>=max){
                count++;
            }
            max=Math.max(max,root.val);

            coun(root.left,max);
            coun(root.right,max);
        }
    }
}