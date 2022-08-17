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
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return null;
        }
 
        ListNode next=null;
        ListNode curr=head;
        ListNode prev=null;
        int count=0;
        
        //to make sure ther arwe k group present in node
        int i=1;
        ListNode temp=head;
        while(i<k && temp.next!=null){
            temp=temp.next;
            i++;
        }
        // /if there are not k group presertn in group
        if(temp.next==null && i<k) return head;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            head.next=reverseKGroup(next,k);
        }
        return prev;  
    }
}