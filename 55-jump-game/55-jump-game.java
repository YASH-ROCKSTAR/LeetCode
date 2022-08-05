class Solution {
    public boolean canJump(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length && sum>=i;i++){
            if(sum<nums[i]+i){
                sum=nums[i]+i;
            }
            if(sum>=n-1){
                return true;
            }
        }
        return false;
    }
}