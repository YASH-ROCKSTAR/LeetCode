class Solution {
    public int solve(int i,int j,String s,String r,int[][] dp){
        if(i<0 ||j<0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==r.charAt(j)){
            return dp[i][j]=1+solve(i-1,j-1,s,r,dp);
        }
        return dp[i][j]=Math.max(solve(i-1,j,s,r,dp),solve(i,j-1,s,r,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int i=text1.length();
        int j=text2.length();
        
        int[][] dp=new int[i][j];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(i-1,j-1,text1,text2,dp);
    }
}