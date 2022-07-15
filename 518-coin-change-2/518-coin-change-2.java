class Solution {
    
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0){
                dp[0][i]=1;
            }
        }
        for(int ind=1;ind<n;ind++){
            for(int tar=0;tar<=amount;tar++){
                int take=0;
                int not=dp[ind-1][tar];
                if(coins[ind]<=tar){
                    take=dp[ind][tar-coins[ind]];
                }
                dp[ind][tar]=take+not;
            }
        }
        return dp[n-1][amount];
    }
}