class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int[][] dp=new int[n+2][2];
        for(int[] ro:dp){
            Arrays.fill(ro,0);
        }
        for(int ind=n-1;ind>=0;ind--){
            dp[ind][1]=Math.max(-price[ind]+dp[ind+1][0],0+dp[ind+1][1]);
            
            dp[ind][0]=Math.max(price[ind]+dp[ind+2][1],0+dp[ind+1][0]);
               
        }
        return dp[0][1];
    }
}