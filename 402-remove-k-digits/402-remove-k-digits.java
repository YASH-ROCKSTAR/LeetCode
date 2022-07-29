class Solution {
    public String removeKdigits(String nums, int k) {
        if(nums.length()==k){
            return "0";
        }
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<nums.length()){
            while(k>0 && !st.isEmpty() && st.peek()>nums.charAt(i)){
                st.pop();
                k--;
            }
            st.push(nums.charAt(i));
            i++;
            
            // corner case when all digits are equal
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        } 
        return sb.toString();
        
                                                    
    }
}