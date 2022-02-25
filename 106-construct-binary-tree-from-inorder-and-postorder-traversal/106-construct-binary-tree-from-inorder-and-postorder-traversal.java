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
        if(inorder==null || postorder==null || inorder.length!=postorder.length){
            return null;
        }
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return build(inorder , 0 , inorder.length-1 , postorder , 0 , postorder.length-1 , map);
        
    }
    public TreeNode build(int[] inorder,int instart,int inend ,int[] postorder,int prestart,int preend,HashMap<Integer,Integer> map){
        
        if(prestart>preend || instart>inend){
            return null;
        }
        TreeNode root=new TreeNode(postorder[preend]);
        int inroot=map.get(postorder[preend]);
        int numleft=inroot-instart;
        
        root.left=build(inorder,instart,inroot-1,postorder,prestart,prestart+numleft-1,map);
        root.right=build(inorder,inroot+1,inend,postorder,prestart+numleft,preend-1,map);
        
        return root;
    }
}