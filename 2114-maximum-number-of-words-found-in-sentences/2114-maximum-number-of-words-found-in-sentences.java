class Solution {
    public int mostWordsFound(String[] sentences) {
        int currmax=0,max=0;
        for(int i=0;i<sentences.length;i++){
            String[] str=sentences[i].split(" ");
            currmax=Math.max(currmax,str.length);
        }
        return currmax;
    }
}