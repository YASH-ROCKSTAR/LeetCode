class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        //First take a hashmap and question says that 
        //ransom note can be constructed by using magazine
        //so the first convert bothe the string to chararray and 
        //used for loop to iterate
        // put the count of each variable of magazine in hashmap
        //and the making rasomnote charaaray and 
        //get count of each element from map it count for an elemt goes less than 0
        //then it will retrun false //if it is 0 or greater than zero than it can mnake 
        //rasom strin gfrm magazine
        //taking dirst example
        // ransomNote = "aa", magazine = "aab"
        //putting magazine into hasmap
        //and a--count will be 2 and b count wil be 1
        // now running for loop for ransom note and getting the element from hasmap
        //in first iteration uit get count of a 1 as it geti a and 2-1 it lwft count 1 
        // again get a from map 1-1 =0 and puuting elent intop it zero so
        //it is true
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