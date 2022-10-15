class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int[] freq=new int[max+1];
        for(int i:nums){
            freq[i]++;
        }
        int [] dp=new int[max+1];
        Arrays.fill(dp,-1);
        return solve(freq,0,dp);
    }
    public int solve(int[] nums,int current,int[] dp){
        if(current>=nums.length){
            return 0;
        }
        if(dp[current]!=-1){
            return dp[current];
        }
        int del=nums[current]*current+solve(nums,current+2,dp);
        int notdel=solve(nums,current+1,dp);
        dp[current]=Math.max(del,notdel);
        return dp[current];
    }
}