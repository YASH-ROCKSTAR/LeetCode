class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char left=s.charAt(i);
            char right=s.charAt(j);
            
            if(left>='a' && left<='z' || left>='A' && left<='Z' || left>='0' && left<='9'){
                if(right>='a' && right<='z' || right>='A' && right<='Z' || right>='0' && right<='9'){
                    if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                        return false;
                    }
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
        return true;
    }
}