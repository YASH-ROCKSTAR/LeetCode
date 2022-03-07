class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        
        char ch[]= new char[n];
        
        for(int i=0;i<s.length();i++){
            
            //iterating over string 
            char sh=s.charAt(i);
            //storing value of indices
            int val=indices[i];
            
            //stoing the value ch with reshuffle
            ch[val]=sh;
        }
        //reshuffle
        return String.valueOf(ch);
    }
}