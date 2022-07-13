class Solution {
    public int solve(int n,int[] dp){
        if(n<2){
            return n;
        }
        if(n==2){
            return 1;
        }
        if(dp[n]!=-1) return dp[n];
        
        return dp[n]=solve(n-1,dp)+solve(n-2,dp)+solve(n-3,dp);
    }
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
}