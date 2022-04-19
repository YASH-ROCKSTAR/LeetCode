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
    public boolean isPalindrome(ListNode head) {
        ListNode fastptr=head;
        ListNode slowptr=head;
        while(fastptr.next!=null && fastptr.next.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        slowptr.next=reverse(slowptr.next);
        slowptr=slowptr.next;
        while(slowptr!=null){
            if(head.val!=slowptr.val){
                return false;
            }
            slowptr=slowptr.next;
            head=head.next;
        }  
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}