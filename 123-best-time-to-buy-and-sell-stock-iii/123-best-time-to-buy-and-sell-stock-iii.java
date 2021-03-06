class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int[][][] dp=new int[n+1][2][3];
        for(int[][] ro:dp){
            for(int[] ro1:ro){
                Arrays.fill(ro1,0);
            }
        }
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                // cap=1 becaue cap==0 alredy 0
                for(int cap=1;cap<=2;cap++){
                    int profit=0;
                    if(buy==1){
                        dp[ind][1][cap]=Math.max(-prices[ind]+dp[ind+1][0][cap],dp[ind+1][1][cap]);
                    }
                    else{
                        dp[ind][0][cap]=Math.max(prices[ind]+dp[ind+1][1][cap-1],dp[ind+1][0][cap]);
                    }
                }
            }
        }
       return dp[0][1][2];
    }
}