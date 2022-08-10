class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        
        char[] ch=new char[n];
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            int val=indices[i];
            
            ch[val]=c;
        }
        return String.valueOf(ch);
    }
}