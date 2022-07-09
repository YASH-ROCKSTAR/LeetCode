class Solution {
    public String reverseWords(String s) {
        if(s.equals(null) || s.equals("")){
            return s;
        }
        String ret="";
        int i=0;
        int j=s.length();
        while(i<j){
            while(i<j && s.charAt(i) == ' '){
                i++;
            }
            String w="";
            while(i<j && s.charAt(i)!= ' '){
                w+=s.charAt(i);
                i++;
            }
            if(!w.equals("")){
                ret=w+" "+ret;
            }
        }
        
    return ret.isEmpty()?"":ret.substring(0,ret.length()-1);
    }
}