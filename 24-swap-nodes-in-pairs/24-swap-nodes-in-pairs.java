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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode current=head;
        ListNode prev=null;
        ListNode nex=null;
        int count=2;
        while(current!=null && count>0){
            nex=current.next;
            current.next=prev;
            prev=current;
            current=nex;
            count--;
        }
        if(nex!=null){
            head.next=swapPairs(nex);
        }
        return prev;
    }
}