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
    public ListNode[] splitListToParts(ListNode head, int k) {
    //     int len=getlength(head);
    //     int partsize=len/k;
    //     int extranode=len%k;
    //     List<ListNode> li=new ArrayList<>();
    //     ListNode current=head,prev=null;
    //     while(head!=null){
    //         int eachpart=partsize;
    //         li.add(current);
    //         while(eachpart>0){
    //             prev=current;
    //             current=current.next;
    //             eachpart--;
    //         }
    //         if(extranode!=0 && current!=null){
    //             extranode--;
    //             prev=current;
    //             current=current.next;
    //         }
    //     }
    //     while(li.size()!=k){
    //         li.add(null);
    //     }
    //     return li;
    // }
    // public int getlength(ListNode head){
    //     int len=0;
    //     while(head!=null){
    //         head=head.next;
    //         len++;
    //     }
    //     return len;
        ListNode[] res = new ListNode[k];
    
    int size = 0;
    ListNode ptr = head;
    
    while(ptr != null){ // calc size of list
        size++;
        ptr = ptr.next;
    }
    
    int extraNodes = size % k; //extra nodes in list
    int nodeSize = size / k; //optimal size for each list

    for(int i = 0 ; i < k && head != null ; i++){ // check both if k > 0 && head != null
        res[i] = head;//store split list
        ListNode prev = null; //keep track of last node for each split list
        
        int currNodeSize = nodeSize;
        if(extraNodes-- > 0) //if extra nodes are present increase current node size by 1
            currNodeSize += 1;

        for(int j = 0 ; j < currNodeSize  ; j++){//move head to new list
            prev = head;
            head = head.next; 
        }
        
        prev.next = null;//make next of last node null
    }
    
    return res;
    }
}