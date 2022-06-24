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
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=root;
        int count=0;
        while(root!=null){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }else{
                    node=st.pop();
                    count++;
                    if(count==k){
                        return node.val;
                    }
                    node=node.right;
                }
            }
        }
        return -1;
    }
}