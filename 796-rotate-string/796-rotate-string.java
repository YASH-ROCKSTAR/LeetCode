class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        //s3 conatins all left shift of s
        String s3=s+s;
        if(s3.contains(goal)){
            return true;
        }
        return false;
    }
}