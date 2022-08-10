class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String,Integer> mp=new HashMap<>();
        mp.put("type",0);
        mp.put("color",1);
        mp.put("name",2);
        int count=0;
        for(List<String> item:items){
            if(item.get(mp.get(ruleKey)).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}