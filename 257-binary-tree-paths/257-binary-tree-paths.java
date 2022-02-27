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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        solve(root,ans,"");
        return ans;
    }
    public void solve(TreeNode root,List<String> res,String str){
        if(root==null){
            return ;
        }
        if(root.right==null && root.left==null){
            res.add(str+root.val);
            return;
        }
        solve(root.left,res,str+root.val+"->");
        solve(root.right,res,str+root.val+"->");
    }
}