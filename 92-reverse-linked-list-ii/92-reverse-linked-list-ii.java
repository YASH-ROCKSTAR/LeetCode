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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //agar head null hai or left right equal hai (if left=1 and right=1)
        //so then no need to reverse and return head
        if(head==null ||left==right){
            return head;
        }
        // mark prev as null tail as null
        // taking prev as prev is first pointer pointing to first node
        //and tail will be the pointer to next
        ListNode prev,tail=null;
        //temp will store value from where value will be break down for connecting node
        //later on as if we will not stre value it will lost the value
        ListNode temp=null;
        //making dum node 
        ListNode dum=new ListNode(0);
        //marking prev as dum
        prev=dum;
        //marking dum.next to head
        dum.next=head;
        //taking the left to node just befopre from where we have to reverse
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        //marking node at left position as tail with prev.next
        tail=prev.next;
        //now iterating for loop from right-left times
        for(int i=0;i<right-left;i++){
            //here 1 is marked as prev if you see in above loop
            //and prev.next 2 is marked as tail
            //first we will reverse 2 and 3 it will make 1-3-2-4-5-6
            //on second iteration reversing 2 3 and 4 it will make 1-4-3-2-5-6(orginal list)
            //now come third iteration here so when i=2 so tail is 2  
            temp=prev.next;
            //here marking tail next (5) to prev.next 
            //so 1 will be connecting to 5 and 4 will lost it value as prev.next is now 5
            //so storing value of 4 in temp so that we can connect prev.next.next to temp
            //mean 1-5-4 so 1 will be 1 next next is connected to temp in(prev.next.next=temp)
            //now connect last node 6 which is left to tail.next as tail is 2 
            //1-5-4-3-2-6 as 2 will be attched to 6(tail.next=tail.next.next)
            prev.next=tail.next;
            tail.next=tail.next.next;
            prev.next.next=temp;
                
        }
        //return dum.next which is head
        return dum.next;
    }
}