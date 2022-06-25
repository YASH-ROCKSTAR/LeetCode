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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return MaxTree(nums,0,nums.length);
    }
    public TreeNode MaxTree(int[] nums,int start,int end){
        if(start==end) return null;
        
        int max=nums[start];
        int maxIndex=start;
        for(int i=start;i<end;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=MaxTree(nums,start,maxIndex);
        root.right=MaxTree(nums,maxIndex+1,end);
        
        return root;
    }
}