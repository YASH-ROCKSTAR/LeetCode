class Solution {
    public int pro(int ind,int buy,int[] prices,int fees,int[][] dp){
        int n=prices.length;
        if(ind==n){
            return 0;
        }
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[ind]+pro(ind+1,0,prices,fees,dp),0+pro(ind+1,1,prices,fees,dp));
        }
        if(buy==0){
            profit=Math.max(prices[ind]-fees+pro(ind+1,1,prices,fees,dp),0+pro(ind+1,0,prices,fees,dp));
        }
        return dp[ind][buy]=profit;
    }
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int dp[][]= new int[n][2];

        for(int row[]: dp)
           Arrays.fill(row,-1);

        if(n==0) return 0;
        return pro(0,1,prices,fee,dp);
    }
}