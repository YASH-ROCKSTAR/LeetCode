class Solution {
    public String minRemoveToMakeValid(String s) {
        
        char[] ch=s.toCharArray();
        
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                st.push(i);
            }else if(ch[i]==')'){
                if(st.size()==0){
                    ch[i]='.';
                }else{
                    st.pop();
                }
            }
        }
        StringBuilder ss=new StringBuilder();
        while(st.size()>0){
            ch[st.pop()]='.';
        }
        for(char c:ch){
            if(c!='.'){
                ss.append(c);
            }
        }
        return ss.toString();
    }
}