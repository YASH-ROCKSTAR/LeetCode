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
        ListNode[] res=new ListNode[k];
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        
        int splitnodesize=size/k;
        int extranode=size%k;
        for(int i=0;i<k && head!=null;i++){
            res[i]=head; // putting split list into it
            ListNode prev=null; //last node null
            int currnodesize=splitnodesize;
            if(extranode-- >0){
                currnodesize+=1;
            }
            for(int j=0;j<currnodesize;j++){
                prev=head;
                head=head.next;
            }
            prev.next=null; // make last of next null
        }
        return res;
    }
    
}