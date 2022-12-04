class Solution {
    public int minDistance(String s1, String s2) {
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return solve(s1,s2,0,0,s1.length(),s2.length(),dp);
    }
    public int solve(String s1,String s2,int i,int j,int m,int n,int[][] dp){
        if(j>=n){
            return m-i;
        }
        if(i>=m){
            return n-j;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=100000;
        if(s1.charAt(i)==s2.charAt(j)){
            return solve(s1,s2,i+1,j+1,m,n,dp);
        }
        else{
            int insert=1+solve(s1,s2,i,j+1,m,n,dp);
            int delete=1+solve(s1,s2,i+1,j,m,n,dp);
            int replace=1+solve(s1,s2,i+1,j+1,m,n,dp);
            ans=Math.min(insert,Math.min(delete,replace));
        }
        return dp[i][j]=ans;
    }
}