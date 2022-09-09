class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return help(n,dp);
    }
    public int help(int n,int[] dp){
        if(n<=1){
            return dp[n]=1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=help(i-1,dp)*help(n-i,dp);
        }
        return dp[n]=sum;
    }
}