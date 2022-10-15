class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        int ans=solve(coins,0,amount,dp);
        if(ans==10001){
            return -1;
        }
        return ans;
    }
    public int solve(int[] arr,int curr,int amo,int[][] dp){
        
        if(amo==0){
            return 0;
        }
        if(arr.length==curr){
            return 10001;
        }
        if(dp[curr][amo]!=-1){
            return dp[curr][amo];
        }
        int currcoin=arr[curr];
        int take=10001;
        if(currcoin<=amo){
            take=1+solve(arr,curr,amo-currcoin,dp);
        }
        int notake=solve(arr,curr+1,amo,dp);
        
        return dp[curr][amo]=Math.min(take,notake);
    }
}