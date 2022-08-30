class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> li=new ArrayList<>();
        List<String> arr=new ArrayList<>();
        func(s,0,arr,li);
        return li;
    }
    //let s consider an example s="aabb"
    //so when call for 0 and 1 index is call 
    //so call for fun will lead on 0 index to a,aab and on 1 index to aa,bb
    //so call for a,aab so further call will be there it will be a,a,bb so we  have to also check 
    //that from where we have doe partition before it substrign is palindrome then only we can 
    //partition it and further a,a,bb get divided into a,a,b,b as now we will partion b so checking b is palindrome then  only we can partition a,a,b,b now also partion from after b a,a,b,b| when indx reaches string length then it is palindrome ,now getting backtrack from end going into aa,bb partition
    //now partion into it gett aa,b,b and further divided at last index aa,b,b| so it reaches last ndex then it is partition so on
    public void func(String s,int ind,List<String> li,List<List<String>> arr){
        //when index reaches to string length then add lin list of list
        if(ind==s.length()){
            arr.add(new ArrayList<>(li));
            return;
        }
        //running a for loop from ind to s.length
        for(int i=ind;i<s.length();i++){
            //checking each partition is palindrome or not
            if(isPalindrome(s,ind,i)){
                //adding that partition in palindrome
                li.add(s.substring(ind,i+1));
                //and increasing our index
                func(s,i+1,li,arr);
                //and backtract from here
                li.remove(li.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}