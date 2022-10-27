class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return solve(coins,0,amount,dp);
    }
    public int solve(int[] nums,int current,int amount,int[][] dp){
        if(amount==0){
            return 1;
        }
        if(current>=nums.length){
            return 0;
        }
        if(dp[current][amount]!=-1){
            return dp[current][amount];
        }
        
        int curcoin=nums[current];
        int take=0;
        if(curcoin<=amount){
            take=solve(nums,current,amount-curcoin,dp);
        }
        int nottake=solve(nums,current+1,amount,dp);
        
        dp[current][amount]=take+nottake;
        return dp[current][amount];
        
    }
}