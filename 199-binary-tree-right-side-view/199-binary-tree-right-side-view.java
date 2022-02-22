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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        rightview(root,li,0);
        return li;
    }
    public void rightview(TreeNode root,List<Integer> res,int curr){
        if(root==null){
            return;
        }
        if(curr==res.size()){
            res.add(root.val);
        }
        rightview(root.right,res,curr+1);
        rightview(root.left,res,curr+1);

    }
}