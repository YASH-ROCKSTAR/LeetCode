class Solution {
    public int solve(int i,int j,int m,int[][] matrix,int[][] dp){
        if(j<0 || j>=m) return (int)Math.pow(10,9);
        
        if(i==0){
            return matrix[0][j];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int up=matrix[i][j]+solve(i-1,j,m,matrix,dp);
        int leftdiag=matrix[i][j]+solve(i-1,j-1,m,matrix,dp);
        int rightdiag=matrix[i][j]+solve(i-1,j+1,m,matrix,dp);
        
        return dp[i][j]=Math.min(up,Math.min(leftdiag,rightdiag));
    }
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int mini=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            int ans=solve(m-1,j,m,matrix,dp);
            mini=Math.min(mini,ans);
        }
        return mini;
    }
}