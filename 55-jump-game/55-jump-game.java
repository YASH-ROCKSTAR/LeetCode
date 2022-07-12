class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int sum=0;
        if(n==1) return true;
        for(int i=0;i<nums.length && sum>=i;i++){
            
            if(sum<i+nums[i]){
                sum=nums[i]+i;
            }
            if(sum>=n-1){
                return true;
            }
        }
        return false;
        
    }
}