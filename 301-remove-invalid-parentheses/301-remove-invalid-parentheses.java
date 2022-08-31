class Solution {
    List<String> res=new ArrayList<>();
    HashSet<String> visited=new HashSet<>();
    
    public int getMinInvalid(String s){
        Stack<Character> st=new Stack<>();
        // int i=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }else if(s.charAt(i)==')'){
                if(st.size()>0 && st.peek()=='(')
                    st.pop();
                else{
                    st.push(')');
                }
            }else{
                continue;
            }
        }
        return st.size();
    }
    void solve(String s,int minInv,HashSet<String> duplicate){
        if(minInv==0){
            int now=getMinInvalid(s);
            if(now==0){
                if(duplicate.contains(s)==false){
                    duplicate.add(s);
                    res.add(s);
                }
            }
            return;
        }
        for(int i=0;i<s.length();i++){
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            
            if(visited.contains(left+right)==false){
                visited.add(left+right);
                solve(left+right,minInv-1,duplicate);
            }
        }
    }
    public List<String> removeInvalidParentheses(String s) {
        int rem=getMinInvalid(s);
        solve(s,rem,new HashSet<>());
        return res;
    }
}
// class Solution {    
//     public List<String> removeInvalidParentheses(String str) {
//         int minrem = getMin(str); // gets the minimum no. of braces to be removed
//         solution(str, minrem, new HashSet<>()); //hashset to check if ans is unique or not
//         return result;
//     }
    
//     public static int getMin(String str){
//        Stack<Character> st = new Stack<>();

//         for( int i = 0; i < str.length(); i++ ){
//             char ch = str.charAt(i);
//             if( ch == ')' ){// closing brace pops if opening brace is at the top
//                             // otherwise pushed
//                 if( st.size() > 0 && st.peek() == '(' ){
//                     st.pop();
//                 }else{
//                     st.push(ch);
//                 }
//             }else if( ch == '(' ) { // opening brace is always pushed
//                 st.push(ch);
//             }else{ // if there are chars like a b c .. etc in the seq just continue
//                 continue;
//             }
//         }
//         return st.size();//elements left in stack were not balanced, and are to be removed
//     }
    
//     List<String> result = new ArrayList<>(); // ans arraylist
//     HashSet<String> visited = new HashSet<>(); // visited string hashset, for optimization
    
//     private void solution(String str, int mra, HashSet<String> duplicate){
//         // mra  --> minimum removes allowed
//         if(mra == 0){
//             int now = getMin(str);// after we have removed required no. of braces, the string should be balanced
//             if(now == 0){
//                 if(duplicate.contains(str) == false){
//                     duplicate.add(str); // hashset to avoid duplicates
//                     result.add(str); // result arraylist
//                 }
//             }
//             return;
//         }
        
//         for(int i = 0; i < str.length(); i++){
//     // we would remove each brace one by one and check if the seq is now balanced or not, in the base case
//     // for eg. in "abcdef" if we are removing 'c',  i would be on 2, so
            
//             String left = str.substring(0, i);  // ab
//             String right = str.substring(i+1);  // def
            
//        if(visited.contains(left + right) == false){ //check to not visit same string twice
//                 visited.add(left + right); // otherwise it gives TLE
//                 solution(left + right , mra - 1, duplicate);
//             }
//         }
//     }
// }