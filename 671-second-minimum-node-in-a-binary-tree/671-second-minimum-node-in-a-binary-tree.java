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
    public void dfs(TreeNode root,Set<Integer> ss){
        if(root!=null){
            ss.add(root.val);
            dfs(root.left,ss);
            dfs(root.right,ss);
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> ss=new HashSet<>();
        dfs(root,ss);
        int minval=root.val;
        long ans=Long.MAX_VALUE;
        for(int i:ss){
            if(minval<i && i<ans){
                ans=i;
            }
        }
        return ans<Long.MAX_VALUE?(int)ans:-1;
    }
}