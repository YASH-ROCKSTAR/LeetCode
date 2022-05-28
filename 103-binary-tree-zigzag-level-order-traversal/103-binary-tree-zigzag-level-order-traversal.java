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
//iterative solution
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        q.add(root);
        boolean lefttoright=false;
        while(!q.isEmpty()){
            int len=q.size();
            LinkedList<Integer> li=new LinkedList<>();
            for(int i=0;i<len;i++){
                TreeNode node=q.poll();
                if(lefttoright){
                    li.addFirst(node.val);
                }else{
                    li.add(node.val);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            list.add(li);
            lefttoright=!lefttoright;
        }
        return list;
    }
    
}