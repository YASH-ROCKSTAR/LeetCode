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
        Queue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode l:lists){
            if(l!=null){
                pq.add(l);
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode point=dummy;
        while(!pq.isEmpty()){
            point.next=pq.poll();
            point=point.next;
            if(point.next!=null){
                pq.add(point.next);
            }
        }
        return dummy.next;
    }
}