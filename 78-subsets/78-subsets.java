class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        if(nums==null || nums.length==0){
            return ans;
        }
        helper(nums,new ArrayList<>(),0);
        return ans;
    }
    public void helper(int[] nums,ArrayList<Integer> sub,int i){
        if(i>=nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        else{
            sub.add(nums[i]);
        
            helper(nums,sub,i+1);
            //remove ith element
            sub.remove(sub.size()-1);
            helper(nums,sub,i+1);
        }
    }
}