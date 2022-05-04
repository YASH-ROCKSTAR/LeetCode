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
        ListNode curr=head;
        int count=2;
        ListNode nex=null;
        ListNode newnode=null;
        while(curr!=null && count>0){
            nex=curr.next;
            curr.next=newnode;
            newnode=curr;
            curr=nex;
            count--;
        }
        if(nex!=null){
            head.next=swapPairs(nex);
        }
        return newnode;
    }
}