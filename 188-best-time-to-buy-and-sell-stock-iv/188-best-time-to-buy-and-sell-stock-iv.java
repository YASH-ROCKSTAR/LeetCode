class Solution {
    public int solve(int ind,int buy,int[] prices,int k,int n,int[][][] dp){
        if(ind==n || k==0){
            return 0;
        }
        if(dp[ind][k][buy]!=-1) return dp[ind][k][buy];
        int profit=0;
        if(buy==0){ //buying on even days
            profit=Math.max(-prices[ind]+solve(ind+1,1,prices,k,n,dp),
                             0+solve(ind+1,0,prices,k,n,dp));
        }else{          
            profit=Math.max(prices[ind]+solve(ind+1,0,prices,k-1,n,dp),
                                        0+solve(ind+1,1,prices,k,n,dp));
        }
        return dp[ind][k][buy]=profit;
    }
    public int maxProfit(int k, int[] prices) {
        
        int n=prices.length;
        int[][][] dp=new int[n+1][k+1][2];
        for(int[][] ro1:dp){
            for(int[] ro2:ro1){
                Arrays.fill(ro2,-1);
            }
        }
        return solve(0,0,prices,k,n,dp);
    }
}