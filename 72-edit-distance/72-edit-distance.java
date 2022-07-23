class Solution {
    public int solve(String st,String tt,int i,int j,int[][] dp){
        //now 1 based indexing
        if(i==0) 
            return j;
        if(j==0) 
            return i;
        
        if(dp[i][j]!=-1) return dp[i][j] ;
        if(st.charAt(i-1)==tt.charAt(j-1))
            return dp[i][j]=0+solve(st,tt,i-1,j-1,dp);
        
        //miminum f three operation
        //delete ,insert and replace operation
        else return dp[i][j] = 1+Math.min(solve(st,tt,i-1,j-1,dp),
        Math.min(solve(st,tt,i-1,j,dp),solve(st,tt,i,j-1,dp)));
    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(word1,word2,m,n,dp);
    }
}