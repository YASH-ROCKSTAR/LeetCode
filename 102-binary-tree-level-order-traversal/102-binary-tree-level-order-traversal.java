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
        
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> arr=new ArrayList<>();
            while(size-- >0){
                
                TreeNode temp=queue.poll();
                arr.add(temp.val);
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            list.add(arr);
        }
        return list;
    }
}