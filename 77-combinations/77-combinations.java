class Solution {
    
    //i denote current element 
    public void helper(int ind,int n,int k,List<Integer> li,List<List<Integer>> ans){
        //base condition
        if(li.size()==k){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=ind;i<=n;i++){
            li.add(i);
            helper(i+1,n,k,li,ans);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> li=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(1,n,k,li,ans);
        return ans;
    }
}