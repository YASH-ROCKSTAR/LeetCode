class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int[][] dp=new int[n+2][2];
        for(int[] ro:dp){
            Arrays.fill(ro,0);
        }
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                int profit=0;
                if(buy==0){
                    profit=Math.max(-price[ind]+dp[ind+1][1],0+dp[ind+1][0]);
                }
                if(buy==1){
                    profit=Math.max(price[ind]+dp[ind+2][0],0+dp[ind+1][1]);
                }
                //ind=ind+2 we have to put ind>=n so not out of bound index
                dp[ind][buy]=profit;
            }
        }
        return dp[0][0];
    }
}