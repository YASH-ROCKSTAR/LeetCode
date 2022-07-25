class Solution {
    public int solve(int ind,int buy,int[] price,int cap,int[][][] dp){
        int n=price.length;
        if(ind==n || cap==0) return 0;
        
        if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
        int profit=0;
        if(buy==1){
           profit=Math.max(-price[ind]+solve(ind+1,0,price,cap,dp),0+solve(ind+1,1,price,cap,dp));
        }
        if(buy==0){
            profit=Math.max(price[ind]+solve(ind+1,1,price,cap-1,dp),0+solve(ind+1,0,price,cap,dp));
        }
        return dp[ind][buy][cap]=profit; 
    }
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int[][][] dp=new int[n][2][3];
        for(int[][] ro:dp){
            for(int[] ro1:ro){
                Arrays.fill(ro1,-1);
            }
        }
       return solve(0,1,prices,2,dp);
    }
}