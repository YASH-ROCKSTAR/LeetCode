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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1=addtostack(l1);
        Stack<Integer> st2=addtostack(l2);
        
        
        int carry=0;
        ListNode temp=null;
        while(!st1.isEmpty() || !st2.isEmpty() ||carry==1){
            int sum=0;
            if(!st1.isEmpty()){
                sum+=st1.pop();
            }
            if(!st2.isEmpty()){
                sum+=st2.pop();
            }
            sum+=carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            
            node.next=temp;
            temp=node;    
            
        }
        
        return temp;
        
    }
    public Stack<Integer> addtostack(ListNode head){
        Stack<Integer> st=new Stack<>();
        while(head!=null){
            st.add(head.val);
            head=head.next;
        }
        return st;
    }
}