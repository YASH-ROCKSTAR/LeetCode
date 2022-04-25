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
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root).isbst;
    }
     public BSTPair valid(TreeNode root){
        if(root==null){
            return new BSTPair();
        }
        BSTPair lpbst=valid(root.left);
        BSTPair rpbst=valid(root.right);
        BSTPair spbst=new BSTPair();
        spbst.min=Math.min(lpbst.min,Math.min(rpbst.min,root.val));
        spbst.max=Math.max(lpbst.max,Math.max(rpbst.max,root.val));
        if(lpbst.isbst && rpbst.isbst &&(lpbst.max < root.val && rpbst.min>root.val)){
            spbst.isbst=true;
                     return spbst;

        }
         spbst.isbst=false;
        return spbst;
    }
}