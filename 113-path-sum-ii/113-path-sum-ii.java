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
//     List<List<Integer>> ans;
//     public void path(TreeNode root,int targetsum,List<Integer> l){
//         if(root.left==null && root.right==null && targetsum-root.val==0){
//             ans.add(new ArrayList<>(l));
//         }
//         List<Integer> list=new ArrayList<>(l);
//         if(root.left!=null){
//             list.add(root.left.val);
//             path(root.left,targetsum-root.val,l);
//             list.remove(list.size()-1);
//         }
//         if(root.right!=null){
//             list.add(root.right.val);
//             path(root.right,targetsum-root.val,l);
//             list.remove(list.size()-1);
            
//         }
//     }
//     public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//         ans=new ArrayList<>();
//         if(root==null){
//             return ans;
//         }
//         List<Integer> l=new ArrayList<>();
//         l.add(root.val);
//         path(root,targetSum,l);
//         return ans;
        
        
//     }
    List<List<Integer>> ans;
    private void solution(TreeNode root, int targetSum, List<Integer> list){
        if(root.left == null && root.right == null && targetSum-root.val == 0){
            ans.add(new ArrayList<>(list));
        }
        
        List<Integer> l = new ArrayList<>(list);
        if(root.left != null){
            l.add(root.left.val);
            solution(root.left, targetSum-root.val, l);
            l.remove(l.size()-1);
        }
        
        if(root.right != null){
            l.add(root.right.val);
            solution(root.right, targetSum-root.val, l);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans = new ArrayList<>();
        if(root == null)
            return ans;
        
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        solution(root, targetSum, list);
        return ans;
    }
    
}