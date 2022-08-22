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
    public ListNode rotateRight(ListNode head, int k) {
        //checking if head is null or list has 1 node and k is 0 
        //so return head
        if(head==null ||head.next==null || k==0){
            return head;
        }
        //calculating length of list
        int len=1;
        ListNode curr=head;
        while(curr.next!=null){
            len++;
            curr=curr.next;
            // ourr curr will reach end
        }
        //since our curr is at last so pointing curr to head
        curr.next=head;
        //suppose our k=12 and len is 5 so we not do 12 roatation 
        //here we will be modulo len by k so
        // 12%5=2
        k=k%len;
        k=len-k; //k=3;
        while(k-->0){
            //till k is 3 curr will reach  
            curr=curr.next;
        }
        //
        // so like 1 2  3 4  5
        // so curr will reach on 3
        // curr.next that is 4 will be marked as head so on
        head=curr.next;
        // curr will reach till 3 length here it will mark null
        curr.next=null;
        
        return head;
    }
}