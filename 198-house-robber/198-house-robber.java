class Solution {
    public int solve(int ind,int[] nums,int[] dp){
        if(ind==0){
            return nums[ind];
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1) return dp[ind];
        int pick=nums[ind]+solve(ind-2,nums,dp);
        int notpick=0+solve(ind-1,nums,dp);
        
        return dp[ind]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int ind=nums.length;
        int[] dp=new int[ind+1];
        Arrays.fill(dp,-1);
        return solve(ind-1,nums,dp);
    }
}