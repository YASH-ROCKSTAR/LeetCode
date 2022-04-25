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
public class BSTPair{
    boolean isbst=true;
    long min=Long.MAX_VALUE;
    long max=Long.MIN_VALUE;
    int sum=0;
    int ans=0;
}
class Solution {
    public int maxSumBST(TreeNode root) {
        return BSTSum(root).ans;
    }
    public BSTPair BSTSum(TreeNode root){
        if(root==null){
            return new BSTPair();
        }
        BSTPair lpbst=BSTSum(root.left);
        BSTPair rpbst=BSTSum(root.right);
        BSTPair spbst=new BSTPair();
        spbst.sum=lpbst.sum+rpbst.sum+root.val;
        spbst.min=Math.min(lpbst.min,Math.min(rpbst.min,root.val));
        spbst.max=Math.max(lpbst.max,Math.max(rpbst.max,root.val));
        if(lpbst.isbst && rpbst.isbst &&(lpbst.max < root.val && rpbst.min>root.val)){
            spbst.isbst=true;
            spbst.ans=Math.max(spbst.sum,Math.max(lpbst.ans,rpbst.ans));
            return spbst;
        }
        spbst.isbst=false;
        spbst.ans=Math.max(lpbst.ans,rpbst.ans);
        return spbst;
    }   
}