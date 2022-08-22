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
    public void reorderList(ListNode head) {
        ListNode mid=middle(head);
        ListNode first=head;
        ListNode second=reverse(mid.next);
        mid.next=null;
        while(second!=null){
            ListNode temp=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp;
            first=temp;
            second=temp2;
            
        }
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode forward=null;
        ListNode curr=head;
        while(curr!=null){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public ListNode middle(ListNode head){
        if(head==null ||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}