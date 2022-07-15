class Solution {
    public int solve(int ind,int tar,int[] coins,int[][] dp){
        if(ind==0){
            if(tar%coins[0]==0){
                return 1;
            }else{
                return 0;
            }
        }
        if(dp[ind][tar]!=-1) return dp[ind][tar];
        int take=0;
        int not=solve(ind-1,tar,coins,dp);
        if(coins[ind]<=tar){
            take=solve(ind,tar-coins[ind],coins,dp);
        }
        return dp[ind][tar]=take+not;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(n-1,amount,coins,dp);
    }
}