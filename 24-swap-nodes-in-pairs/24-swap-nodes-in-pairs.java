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
        ListNode curr=head;
        ListNode prev=null;
        ListNode forward=null;
        int count=2;
        while(curr!=null && count>0){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
            count--;
        }
        if(forward!=null){
            head.next=swapPairs(forward);
        }
        return prev;
    }
}