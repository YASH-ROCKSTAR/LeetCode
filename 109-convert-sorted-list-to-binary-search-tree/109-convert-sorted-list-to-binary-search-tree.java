/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head);
    }
    public TreeNode helper(ListNode head){
        if(head==null){
            return null;
        }
        ListNode node=getmiddlenode(head);
        if(head==node){
            return new TreeNode(node.val);
        }
        TreeNode root=new TreeNode(node.val);
        root.left=helper(head);
        root.right=helper(node.next);
        
        return root;
    }
    public ListNode getmiddlenode(ListNode head){
        if(head==null){
            return null;
        }
        ListNode slowptr=head;
        ListNode fastptr=head;
        ListNode prev=null;
        while(fastptr!=null && fastptr.next!=null){
            prev=slowptr;
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        //cut it to stop traversal
        if(prev!=null){
            prev.next=null;
        }
        return slowptr;
    }
}