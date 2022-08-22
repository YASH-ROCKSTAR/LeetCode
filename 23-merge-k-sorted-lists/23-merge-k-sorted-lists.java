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
        // sorting list with help of priority queue
        Queue<ListNode> q=new PriorityQueue<>((a,b)->(a.val-b.val));
        //we will be firstly adding head of each list of list
        
        for(ListNode l:lists){
            if(l!=null){
                q.add(l);
            }
        }
        ListNode dumm=new ListNode(0);
        ListNode point=dumm;
        while(!q.isEmpty()){
            point.next=q.poll();  //poping out first elemnet 1 
            point=point.next; // pointing pointer to next
            
            
            //checking pointer is not null
            if(point.next!=null){
                //adding next element of each list head next like 1 so 4 will be 
                //inserted to queue
                //whichever value is poped out so that and which ever list of list contains that value its head.next head.next is inserted in queue
                q.add(point.next);
            }
        }
        return dumm.next;
    }
}

//whole process included poping value and adding to queue and again adding it next

// like first hed of each list ius added
//that is 1-1-2
//then poping out value so 1 is poped from fitst list then it next is 4
//poping again 1 from queue that is second list of list value 
// so it next is 3 so adding in queue
// now 2 will be pop from queue and adding it next is 6 so adding in queue to it
//now 3 will be poped out so it next is 4 added in min heap
//now any 4 will be taken out any add 5 to it 
//now 4 will be added and it has no next
//now 5 will poped out its next is notinh
//now 6 is poped out it next its none