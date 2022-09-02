class Solution {
    public String removeDuplicateLetters(String s) {
        int[] arr=new int[26];
        
        HashMap<Character,Integer> mp=new HashMap<>();
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),i);
        }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            
            if(arr[curr-'a']==1){
                continue;
            }
            
            while(!st.isEmpty() && st.peek()>curr && mp.get(st.peek())>i){
                arr[st.pop()-'a']=0;
            }
            st.push(curr);
            arr[curr-'a']=1;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}