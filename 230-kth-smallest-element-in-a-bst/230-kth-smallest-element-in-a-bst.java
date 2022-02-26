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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode node=root;
        int count=0;
        while(true){
            if(node!=null){
                s.push(node);
                node=node.left;
            }else{
                if(s.isEmpty()){
                    break;
                }
                //inorder
                node=s.pop();
                count++;
                if(count==k){
                    return node.val;
                }
                node=node.right;
            }
        }
        return -1;
    }
}