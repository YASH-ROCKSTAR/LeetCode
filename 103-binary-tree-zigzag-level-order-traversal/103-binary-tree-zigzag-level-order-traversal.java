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
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        queue.add(root);
        boolean iszigzag=false;
        while(!queue.isEmpty()){
            int len=queue.size();
            LinkedList<Integer> li=new LinkedList<>();
            for(int i=0;i<len;i++){
                TreeNode node=queue.poll();
                if(iszigzag){
                    li.addFirst(node.val);
                }
                else{
                    li.add(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                
            }
            list.add(li);
            iszigzag=!iszigzag;
            
        }
        return list;
    }
    
}