class Solution {
    //very simple nad a crisp solution is there
    //using stack
    //so process will be that we will be we will be pushing index of bracket and with that we will calculating longest valid bracket so firstly we will be pushing index value of open bracket if we are getting else if it is done then pop the element from stack and checking if stack is empty 
    //then put that index value and else calculate max value so at last index is at two and stack has {-1,0} left sol res is (0,2-0) so max value is 2 
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int res=0;
        st.push(-1);
        
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    res=Math.max(res,i-st.peek());
                }
            }
        }
        return res;
    }
    
}