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
    //as you can see the tree and we have to do preorder travrsal here
    //firstly we have make a stack then we insert root first into it
    //so we have to make tree where we have attach node to right so that we can make linked list
    //preoder traversal is root left and right

    //put the root into stack that is 1
    //then in curr take element 1 
    // then pop that element beacuse it has no use now
    //so check it left and right push elemt 2 and 5 into stack
    //the 2 is peek and pop and attach to curr right
    //then checking it left and right and pushing 3 and 4 into it
    //then peeking 3 from it and ataching it to curr
    //then curr.left and right is check it is null 
    //then and peeking 4 from it attching to 1-2-3-4
    // then 5 is left is stack peek it pop it and then 
    //it is attached to its right and 5 left is 6 and putting it into stack 
    //then peekin from it 6 and pop it
    public void flatten(TreeNode root) {
        //if root is null we will return nothing
        if(root==null){
           return;
        }
        //making stack containing treenode
        Stack<TreeNode> st=new Stack<>();
        //pushing root first into the node
        st.push(root);
        // till the stack is empty
        while(!st.isEmpty()){
            // peek() out that node
            TreeNode curr=st.peek();
            //then pop it also so that it doesnt remain in the stack
            st.pop();
            //check if curr mean peek element right is present then push into stack
            if(curr.right!=null){
                st.push(curr.right);
            }
            //checking curr lefft is not null push into stack
            if(curr.left!=null){
                st.push(curr.left);
            }
            //is stack is not empty then at curr right only put attaching elment by peeking it
            if(!st.isEmpty()){
                curr.right=st.peek();
            }
            //curr left will always be null
            curr.left=null;
        }
    }
}