class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null ||strs.length==0){
            return new ArrayList<>();
        }
        // List<List<String>> li=new ArrayList<>();
        //take a hashmap and store key as string and values in arraylist
        //then convert particular word in chararray
        //then soert it 
        //check if does not contian in map then put it into map
        //if map does contian same sorted word then only increse sizwe at that particular word it will mean that if 3 is count for one word then in that list 3 word related to it will contian in list
        //like here eat will sort into aet and put into map with size -1
        //then tea is sort to aet and put in to map it contian aet so onlty incerase size by 2
        //then it goes to tan it will sort into ant with size-1 and then ate sort top aet
        //then it contian aet so incerease size-3
        //then nat will sort to ant and it contian ant so size will be 2 
        //then bat will sort to abt so it will be add into 
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