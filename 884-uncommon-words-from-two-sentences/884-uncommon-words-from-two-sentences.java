class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> mp1=new HashMap<>();
        for(String str1:s1.split(" ")){
            mp1.put(str1,mp1.getOrDefault(str1,0)+1);
        }
        for(String str2:s2.split(" ")){
            mp1.put(str2,mp1.getOrDefault(str2,0)+1);
        }
        ArrayList<String> li=new ArrayList<>();
        for(String str:mp1.keySet()){
            if(mp1.get(str)==1){
                li.add(str);
            }
        }
        String[] arr=new String[li.size()];
        arr=li.toArray(arr);
        return arr;
    }
}