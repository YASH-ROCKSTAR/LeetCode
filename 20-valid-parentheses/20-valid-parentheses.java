class Solution {
    public boolean isValid(String s) {
        // so simply it is process in which we have to find whether given pair of parenthesi is valid
        //so there are three type of parenthensis {} , () ,[] and there are pair we have 
        //return whether open bracket is followed by closed bracket
        // so firstly we check that we to see that opening bracket are there so
        // checking that si there any { ( [ so we have to push that in stack
        //then we have to firstly check that whether stack is empty or not if empty returhn false;
        //then taking out peek mean that eleemnt inseted in last and checking it with ch that whether w e have closed bracket condition match then we pop out 
        // else we have to return false and if check then at last thatb stacjk is empty then it is true
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char top=st.peek();
                    if(ch=='}' && top=='{' ||
                      ch==')' && top=='(' ||
                      ch==']' && top=='['){
                        st.pop();
                    }else{
                        return false;
                    }
                }
            }
            
        }
        return st.isEmpty();
    }
}