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
    // so firstly 0 is taken as middle as slow pointer reaches there
    //then getting slow of data before middle (-10,-3) so its slow is -3
    //so getting attached on root left -3
    //now it find middle of value after middle(5,9)
    //so there middle is 9
    // so attaching root right with 9
    //now left with -10 and 5 so they are single so they are now middle
    //now attaching it to -3 left -10
    //and attaching 5 with 9 to the left
    public TreeNode helper(ListNode head){
        //if head is null then return null in tree
        if(head==null){
            return null;
        }
        //calling the middle node here
        ListNode node=middle(head);
        // so crearting here a root as take midde value in it
        TreeNode root=new TreeNode(node.val);
        //if(head and node value are same then return new treenode with node value
        if(head==node){
            return new TreeNode(node.val);
        }
        //now taking the 0 left so it will be first -3 and and we take -10
        root.left=helper(head);
        //here come data after middle it will be on root right
        root.right=helper(node.next);
        
        return root;
        
    }//first thing is to find middle of linked list as 
    //as we using recursive approach so
    //finding middle and all the data before middle will be on left
    // all the data after middle will be on right
    public ListNode middle(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=slow;
        ListNode prev=slow;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        // taking prev as slow and breaking the link from middle 
        //as we have break the prev as marked prev.next as null
        //so that correct binary formed
        if(prev!=null){
            prev.next=null;
        }
        return slow;
    }
}