class Solution {
    public boolean validPalindrome(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(ch[i]!=ch[j]){
                return palin(i+1,j,ch) || palin(i,j-1,ch);
            }
            i++;
            j--;
            
        }
        return true;
    }
    public boolean palin(int i,int j,char[] s){
        
        while(i<j){
            if(s[i]!=s[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}