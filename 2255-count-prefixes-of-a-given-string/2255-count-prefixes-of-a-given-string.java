class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String i:words){
            if(s.indexOf(i)==0){
                count++;
            }
        }
        return count;
    }
}