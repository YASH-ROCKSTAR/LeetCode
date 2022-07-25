class Solution {
    public int pro(int ind,int buy,int[] price,int[][] dp){
        int n=price.length;
        if(ind>=n){
            return 0;
        }
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        int profit=0;
        if(buy==0){
            profit=Math.max(-price[ind]+pro(ind+1,1,price,dp),0+pro(ind+1,0,price,dp));
        }
        if(buy==1){
            profit=Math.max(price[ind]+pro(ind+2,0,price,dp),0+pro(ind+1,1,price,dp));
        }
        //ind=ind+2 we have to put ind>=n so not out of bound index
        return dp[ind][buy]=profit;
    }
    public int maxProfit(int[] price) {
        int n=price.length;
        int[][] dp=new int[n][2];
        for(int[] ro:dp){
            Arrays.fill(ro,-1);
        }
        return pro(0,0,price,dp);
    }
}