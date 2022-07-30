class Solution {
    public int solve(int ind,int prev,int[] nums,int n,int[][] dp){
        if(ind==n){
            return 0;
        }
        if(dp[ind][prev+1]!=-1) return dp[ind][prev+1];
        int len=0;
        len=0+solve(ind+1,prev,nums,n,dp);
        if(prev==-1 || nums[ind]>nums[prev]){
            len=Math.max(len,1+solve(ind+1,ind,nums,n,dp));
        }
        return dp[ind][prev+1]=len;
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,-1,nums,n,dp);
    }
}