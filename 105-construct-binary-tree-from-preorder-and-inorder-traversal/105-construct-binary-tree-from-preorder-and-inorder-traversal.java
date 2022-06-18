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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> mp=new HashMap<>();
        
        for(int i=0;i<inorder.length;i++){
             mp.put(inorder[i],i);
        }
        TreeNode root=build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mp);
        
        return root;
    }
    public TreeNode build(int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend,Map<Integer,Integer> mp){
        if(prestart>preend || instart>inend) return null;
        
        //root value from preorder first
        TreeNode root=new TreeNode(preorder[prestart]);
        //iiner root value in inorder
        int inroot=mp.get(root.val);
        //now left part 
        int left=inroot-instart;
        
        root.left=build(preorder,prestart+1,prestart+left,inorder,instart,inroot-1,mp);
        root.right=build(preorder,prestart+left+1,preend,inorder,inroot+1,inend,mp);
        
        return root;
        
    }
}
