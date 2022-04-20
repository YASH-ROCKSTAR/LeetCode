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
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse right half
        slow.next=reverse(slow.next);
        
        //moving slow to right half
        slow=slow.next;
        
        //checking left and right half
        while(slow!=null){
            if(head.val!=slow.val){
                return false;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode newnode=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=newnode;
            newnode=head;
            head=next;
        }
        return newnode;
    }
}