class Solution {
    List<List<Integer>> ans;
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
            while(i+1<nums.length && nums[i]==nums[i+1]) i++;
            helper(nums,sub,i+1);
        }
    } 
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ans=new ArrayList<>();
        helper(nums,new ArrayList<>(),0);
        return ans;
    }
}