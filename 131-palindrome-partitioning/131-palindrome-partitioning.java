class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> li=new ArrayList<>();
        solve(0,s,li,ans);
        return ans;
    }
    void solve(int index,String s,List<String> li,List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPlaindrome(s,index,i)){
                li.add(s.substring(index,i+1));
                solve(i+1,s,li,ans);
                li.remove(li.size()-1);
            }
        }
    }
    boolean isPlaindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}