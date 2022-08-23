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
    public ListNode swapNodes(ListNode head, int k) {
        //take fast first and second on head
        ListNode fast=head,first=head,second=head;
        //move fast to reach the beigging of k node 
        //fast will reach to 2
        for(int i=0;i<k-1;i++){
            fast=fast.next;
        }
        //allocate first to 2
        first=fast;
        // run fast till its next is not null
        while(fast.next!=null){
            //fast will reach at 2 and it next is null
            //so second will 4 from last k last node(4)
            fast=fast.next;
            second=second.next;
        }
        //then swappingg node in pair both 2 and 4 are swapped
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        
        return head;
    }
}