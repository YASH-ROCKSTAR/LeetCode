class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(1,n,k,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int start,int n,int k,List<Integer> li,List<List<Integer>> ans){
        if(li.size()==k && n==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=start;i<=9;i++){
            li.add(i);
            helper(i+1,n-i,k,li,ans);
            li.remove(li.size()-1);
        }
    }
}