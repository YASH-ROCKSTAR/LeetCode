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
        int[][] dp=new int[n][2];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,1,prices,n,dp);
    }
}