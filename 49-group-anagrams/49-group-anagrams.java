class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> li=new ArrayList<>();
        HashMap<String,List<String>> arr=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=String.valueOf(ch);
            if(!arr.containsKey(key)){
                arr.put(key,new ArrayList<>());
            }
            arr.get(key).add(s);
        }
        return new ArrayList<>(arr.values());
    }
}