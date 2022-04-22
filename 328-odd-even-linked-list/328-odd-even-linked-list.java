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
    public ListNode oddEvenList(ListNode head) {
        if(head!=null){
            ListNode odd=head;
            //second elemnet will be even
            ListNode even=head.next;
            ListNode evenstart=even;
            while(odd.next!=null && even.next!=null){
                odd.next=even.next;
                odd=odd.next;
                even.next=odd.next;
                even=even.next;
            }
            //here last odd node will be appointing ro evenestart
            odd.next=evenstart;
            //condition when list is off odd size then odd node will at null and even will be not at null
            //so we have to make even null
            
        }  
        return head;
    }
}