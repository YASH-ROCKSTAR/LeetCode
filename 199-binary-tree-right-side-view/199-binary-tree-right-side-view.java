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
        rightside(root,li,0);
        return li;
    }
    public void rightside(TreeNode root,List<Integer> li,int level){
        if(root==null){
            return;
        }
        if(level==li.size()){
            li.add(root.val);
        }
        //here we are using reverse preorder traversal --> root,right,left
        rightside(root.right,li,level+1);
        rightside(root.left,li,level+1);
    }
}