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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        if(root==null){
            return list;
        }
        queue.offer(root);
        boolean flag=true;
        while(!queue.isEmpty()){
            int len=queue.size();
            List<Integer> li=new ArrayList<>(len);
            for(int i=0;i<len;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                if(flag==true){
                    li.add(queue.poll().val);
                }else{
                    li.add(0,queue.poll().val);
                }
            }
            flag=!flag;
            list.add(li);
            
        }
        return list;
    }
}