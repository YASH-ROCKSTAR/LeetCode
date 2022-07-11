class Solution {
    public int solve(int n,int[] dp){
        // if(n==0){
        //     return 0; 
        // }
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        // Arrays.fill(dp,-1);
        return solve(n,dp);
    }
}