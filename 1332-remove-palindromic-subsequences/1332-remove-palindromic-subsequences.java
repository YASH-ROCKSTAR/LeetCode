class Solution {
    public int removePalindromeSub(String s) {
        if(substring(s)) return 1;
        return 2;
    }
    boolean substring(String s){
        int i=0,n=s.length()-1;
        while(i<n){
            if(s.charAt(i)!=s.charAt(n)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
}