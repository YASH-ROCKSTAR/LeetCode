class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i])<=Math.abs(ans)){
                if(Math.abs(nums[i])==Math.abs(ans)){
                    ans=Math.max(ans,nums[i]);
                } 
                else{
                    ans=nums[i];
                }
            }
        }
        return ans;
    }
}