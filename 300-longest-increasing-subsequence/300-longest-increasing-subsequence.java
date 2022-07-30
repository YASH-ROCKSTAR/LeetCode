class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row,0);
        }
        //no need to write base case as all array is fill with zero only
        for(int ind=n-1;ind>=0;ind--){
            // prev should be ind-1 because it should be always less than ind
            //prev>=-1 because when it doesnot have it prev element
            for(int prev=ind-1;prev>=-1;prev--){
                int len=0+dp[ind+1][prev+1];
                if(prev==-1 || nums[ind]>nums[prev]){
                    len=Math.max(len,1+dp[ind+1][ind+1]);
                } 
                dp[ind][prev+1]=len;
            }
            
        }
        return dp[0][-1+1];
    }
}