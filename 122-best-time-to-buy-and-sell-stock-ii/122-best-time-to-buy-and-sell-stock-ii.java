class Solution {
    public int solve(int ind,int buy,int[] arr,int n,int[][] dp){
        if(ind==n){
            return 0;
        }
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        int profit=0;
        if(buy==1){
            profit=Math.max(-arr[ind]+solve(ind+1,0,arr,n,dp),0+solve(ind+1,1,arr,n,dp));
        }else{
            profit=Math.max(arr[ind]+solve(ind+1,1,arr,n,dp),0+solve(ind+1,0,arr,n,dp));
        }
        return dp[ind][buy]=profit;
    }
    public int maxProfit(int[] prices) {
         int n=prices.length;
        int[][] dp=new int[n+1][2];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        dp[n][0]=dp[n][1]=0;
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                int profit=0;
                if(buy==1){//buy stiock
                    profit=Math.max(-prices[ind]+dp[ind+1][0],0+dp[ind+1][1]);
                }if(buy==0){//sell stock
                    profit=Math.max(prices[ind]+dp[ind+1][1],0+dp[ind+1][0]);
                }
                dp[ind][buy]=profit;
            }
        }
        return dp[0][1];
    }
}