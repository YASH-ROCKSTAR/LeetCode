class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return solve(0,-1,nums,dp);
    }
    public int solve(int current,int prev,int[] nums,int[][] dp){
        if(current==nums.length){
            return 0;
        }
        int take=0;
        if(dp[current][prev+1]!=-1){
            return dp[current][prev+1];
        }
        if(prev==-1 || nums[current]>nums[prev]){
            take=1+solve(current+1,current,nums,dp);
        }
        int notake=solve(current+1,prev,nums,dp);
        return dp[current][prev+1]=Math.max(take,notake);
    }
}