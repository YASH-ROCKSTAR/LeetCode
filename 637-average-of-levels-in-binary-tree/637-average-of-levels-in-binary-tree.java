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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> li=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>(); 
        q.add(root);
        
        //so here we are using level order traversal
        //and only the thing we doing here are we are take the size of stack at each level and running         //a for loop for that size and taking the average of all element at that level so adding it in list
        while(q.size()>0){
            int size=q.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
            
                sum+=node.val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            li.add(sum/size);
        }
        return li;
        
    }
}