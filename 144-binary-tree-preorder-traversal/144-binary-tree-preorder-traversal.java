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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        if(root==null){
            return li;
        }
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            TreeNode node=st.pop();
            li.add(node.val);
            //why we are pushing right in stack first because stack is lifo data structure
            //and so when we will be poping out element we need left first so that why we have push left at last after right
            if(node.right!=null){
                st.push(node.right);
            }if(node.left!=null){
                st.add(node.left);
            }
        }
        return li;
    }
}