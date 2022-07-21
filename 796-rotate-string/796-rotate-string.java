class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;

        }
        //as  said that left most charcter to be shift to last of string s
        String str=s+s;
        if(str.contains(goal)){
            return true;
        }
        return false;
        
    }
}