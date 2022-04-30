class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String w:words){
            int i=0,j=0;boolean flag=true;
            if(w.length()>s.length()){
                flag=false; 
            }else{
                while(i<w.length() && j<s.length()){
                    if(w.charAt(i)!=s.charAt(j)){
                        flag=false;
                        break;
                    }else{
                        i++;
                        j++;
                    }
                }
            }
            if(flag==true){
                count++;
            }
        }
        return count;
    }
}