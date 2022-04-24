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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> q=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode l:lists){
            if(l!=null){
                q.add(l);
            }
        }
        ListNode head=new ListNode(-1);
        ListNode point=head;
        while(!q.isEmpty()){
            point.next=q.poll();
            point=point.next; //checking next element
            if(point.next!=null){
                //adding next if next is not null
                q.add(point.next);
            }
        }
        return head.next;
    }
}