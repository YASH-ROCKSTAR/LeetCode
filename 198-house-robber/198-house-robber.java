class Solution {
    
    public int rob(int[] nums) {
        int ind=nums.length;
        int[] dp=new int[ind+1];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        for(int i=1;i<ind;i++){
            int take=nums[i];
            if(i>1){
                take+=dp[i-2];
            }
            int nottake=0+dp[i-1];
            
            dp[i]=Math.max(take,nottake);
        }
        return dp[ind-1];
        
    }
}