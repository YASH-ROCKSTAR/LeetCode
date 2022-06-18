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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null ||inorder.length!=postorder.length){
            return null;
        }
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        TreeNode root=build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mp);
        
        return root;
    }
    public TreeNode build(int[] inorder,int instart,int inend,int[] postorder,int poststart,int postend,Map<Integer,Integer> mp){
        
        if(instart>inend || poststart>postend) return null;
        
        TreeNode root=new TreeNode(postorder[postend]);
        int inroot=mp.get(root.val);
       //no of element in left 
        int left=inroot-instart;
        
        root.left=build(inorder,instart,inroot-1,postorder,poststart,poststart+left-1,mp);
        root.right=build(inorder,inroot+1,inend,postorder,poststart+left,postend-1,mp);
        
        return root;
    }
}