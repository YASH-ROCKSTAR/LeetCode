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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> li=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null) return li;
        while(root!=null || !st.isEmpty()){
            if(root!=null){
                st.push(root);
                root=root.left;
            }
            else{
                TreeNode temp=st.peek().right;
                if(temp==null){
                    temp=st.peek();
                    st.pop();
                    
                    li.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp=st.peek();
                        st.pop();
                        li.add(temp.val);
                    }
                }else{
                    root=temp;
                }
            }
        }
        return li;
    }
}