class Solution {
    Integer[] dp;
    public int solve(int ind,int[] nums){
        if(ind==nums.length-1) return 0;
        if(ind>=nums.length) return Integer.MAX_VALUE-1;
        if(dp[ind]!=null) return dp[ind];
        int min=Integer.MAX_VALUE-1;
        for(int i=1;i<=nums[ind];i++){
            min=Math.min(min,1+solve(ind+i,nums));
        }
        return dp[ind]=min;
    }
    public int jump(int[] nums) {
        dp=new Integer[nums.length];
        // Arrays.fill(dp,Integer.MAX_VALUE);
        return solve(0,nums);
    }
}