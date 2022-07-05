class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int index,int[] arr,int target,List<Integer> li,List<List<Integer>> ans){
        
        if(target==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            li.add(arr[i]);
            helper(i+1,arr,target-arr[i],li,ans);
            li.remove(li.size()-1);
        }
    }
}