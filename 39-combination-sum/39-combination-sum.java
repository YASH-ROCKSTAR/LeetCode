class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int index,int[] arr,int target,List<Integer> li,List<List<Integer>> ans){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(li));
            }
            return;
        }
        if(arr[index]<=target){
            li.add(arr[index]);
            //picking the element
            helper(index,arr,target-arr[index],li,ans);
            li.remove(li.size()-1);
        }
        //not picking element
        helper(index+1,arr,target,li,ans);
    }
}