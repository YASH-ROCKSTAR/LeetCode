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
        if(head==null || head.next==null){
            return head;
        }
        //making new node before head
        ListNode curr=new ListNode(0);
        // marking curr.next to head
        curr.next=head;
        // marking new node curr as prev
        ListNode prev=curr;
        while(head!=null){
            //checking if head.next is not null and head and head next val are equal 
            if(head.next!=null && head.val==head.next.val){
                // till in series all values match movce head at last position of that first duplicate element
                while(head.next!=null && head.val==head.next.val){
                    //it will reach to duplicate node last element
                    head=head.next;
                }
                //marking the prev.next to head next because from where
                //the duplicate start to that head where first duplicate last  element 
                // it head.next so prev.next =head.next
                prev.next=head.next;
            }else{
                //if not found duplicate themn prev =prev.next
                prev=prev.next;
            }
            //moving the headto next as it will lie on last value of duplicate value 
            // to match another value we move head to next
            head=head.next;
        }
        return curr.next;
    }
}