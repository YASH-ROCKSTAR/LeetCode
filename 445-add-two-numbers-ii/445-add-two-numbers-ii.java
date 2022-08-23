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
        
        //making a 2 stack and make fucntion to add number of l1 and l2 list into stack
        Stack<Integer> st1=addtostack(l1);
        Stack<Integer> st2=addtostack(l2);
        
        //take carry ==0
        int carry=0;
        // storing ans into it
        ListNode temp=null;
        //till both stack is empty and carry==1
        while(!st1.isEmpty() || !st2.isEmpty() ||carry==1){
            int sum=0;
            //adding element
            if(!st1.isEmpty()){
                sum+=st1.pop();
            }
            if(!st2.isEmpty()){
                sum+=st2.pop();
            }
            //if carry is ther then adding it into ans 
            sum+=carry;
            carry=sum/10;// sum is of two digit the  in carrry sum/10 will be stored last digit of dum
            // storing sum into node to attach into it
            ListNode node=new ListNode(sum%10);
            //node .next is connected to temp
            node.next=temp;
            //temp to node;
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