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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return li;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> arr=new ArrayList<>();
            while(size-->0){
                TreeNode temp=q.poll();
                
                arr.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                
            }
            li.add(arr);
            
        }
        return li;
    }
}