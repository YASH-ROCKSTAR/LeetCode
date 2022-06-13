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
        List<List<Integer>> li=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return li;
        }
        q.add(root);
        boolean lefttoright=false;
        while(!q.isEmpty()){
            int len=q.size();
            LinkedList<Integer> list=new LinkedList<>();
            for(int i=0;i<len;i++){
                TreeNode node=q.poll();
                if(lefttoright){
                    list.addFirst(node.val);
                }else{
                    list.add(node.val);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            li.add(list);
            lefttoright=!lefttoright;
        }
        return li;
    }
}