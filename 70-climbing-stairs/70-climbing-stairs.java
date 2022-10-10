class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return totalways(0,n,dp);
    }
    public int totalways(int current,int target,int[] dp){
        if(current==target){
            return 1;
        }
        if(current>target){
            return 0;
        }
        if(dp[current]!=-1){
            return dp[current];
        }
        int onejump=totalways(current+1,target,dp);
        int twojump=totalways(current+2,target,dp);
        
        return dp[current]=onejump+twojump;
    }
}