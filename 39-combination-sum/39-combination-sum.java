class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void solve(int index,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        // when recursion tree reaches to last index
        if(index==arr.length){
            // when target get zero
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //now checking if our index value is less than target then adding it to data structure
        if(arr[index]<=target){
            ds.add(arr[index]);
            //when picking the element
            solve(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        //when not pricking the element
        solve(index+1,arr,target,ans,ds);
    }
}