class Solution {
    public String reverseWords(String s) {
        String[] sp=s.split(" ");
        String res="";
        for(int i=0;i<sp.length;i++){
            String curr=sp[i];
            String temp="";
            int len=curr.length()-1;
            for(int j=len;j>=0;j--){
                temp+=curr.charAt(j);
            }
            res+=temp+" ";
            
        }
        return res.substring(0,res.length()-1);
    }
}