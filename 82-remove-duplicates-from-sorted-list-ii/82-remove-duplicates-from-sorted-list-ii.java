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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        if(head.val==head.next.val){
            int removedElement=head.val;
            while(head!=null && head.val==removedElement){
                head=head.next;
            }
            return deleteDuplicates(head);
        }
        head.next=deleteDuplicates(head.next);
        return head;
    }
}