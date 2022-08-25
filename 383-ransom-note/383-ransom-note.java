class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> maga=new HashMap<>();
        for(char c:magazine.toCharArray()){
            int count=maga.getOrDefault(c,0)+1;
            maga.put(c,count);
        }
        for(char c:ransomNote.toCharArray()){
            int count=maga.getOrDefault(c,0)-1;
            if(count<0){
                return false;
            }
            maga.put(c,count);
        }
        return true;
    }
}