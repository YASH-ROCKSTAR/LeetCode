class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        HashMap<String,Integer> mp1=new HashMap<>();
        HashMap<String,Integer> mp2=new HashMap<>();
        
        for(String str1:words1){
            mp1.put(str1,mp1.getOrDefault(str1,0)+1);
        }
        for(String str2:words2){
            mp2.put(str2,mp2.getOrDefault(str2,0)+1);
        }
        for(Map.Entry en:mp1.entrySet()){
            if(mp2.get(en.getKey())!=null && (Integer)en.getValue()==1 && (Integer)mp2.get(en.getKey())==1){
                count++;
            }
        }
        return count;
    }
}