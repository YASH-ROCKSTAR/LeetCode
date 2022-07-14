class Solution {
    public int solve(int ind,int[] coins,int tar,int[][] dp){
        if(ind==0){
            if(tar%coins[0]==0) return tar/coins[0];
            else return (int)Math.pow(10,9);
        }
        if(dp[ind][tar]!=-1) return dp[ind][tar];
        int take=(int)Math.pow(10,9);
        int not=0+solve(ind-1,coins,tar,dp);
        if(coins[ind]<=tar) take=1+solve(ind,coins,tar-coins[ind],dp);
        
        return dp[ind][tar]=Math.min(take,not);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=solve(n-1,coins,amount,dp);
        if(ans >= (int)Math.pow(10,9)) return -1;
        return ans;
    }
}