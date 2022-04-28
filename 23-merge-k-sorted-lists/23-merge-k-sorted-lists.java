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
      
        Queue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>(){
            
            public int compare(ListNode o1,ListNode o2){
                return o1.val-o2.val;
            }
        });
        for(ListNode l:lists){
            if(l!=null){
                pq.add(l);
            }
        }
        //making dummy node
        ListNode head=new ListNode(-1);
        ListNode point=head;
        while(!pq.isEmpty()){
            point.next=pq.poll();
            point=point.next; //cheking next element
            if(point.next!=null){
                //adding if next element is null
                pq.add(point.next);
            }
        }
        return head.next;
    }
}