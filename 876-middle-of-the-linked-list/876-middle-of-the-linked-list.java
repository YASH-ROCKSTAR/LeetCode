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
    public int len(ListNode head){
        int co=0;
        while(head!=null){
            co++;
            head=head.next;
        }
        return co;
    }
    public ListNode middleNode(ListNode head) {
        int length=len(head);
        int ans=(length/2);
        int count=0;
        ListNode temp=head;
        while(count<ans){
            temp=temp.next;
            count++;
        }
        return temp;
    }
}