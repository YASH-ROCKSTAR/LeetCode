class Solution {
    public int solve(int i,int j,int m,int[][] arr,int[][] dp){
        if(j<0 || j>=m) return (int)Math.pow(10,9);
        
        if(i==0){
            return arr[0][j];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int up=arr[i][j]+solve(i-1,j,m,arr,dp);
        int leftdiag=arr[i][j]+solve(i-1,j-1,m,arr,dp);
        int rightdiag=arr[i][j]+solve(i-1,j+1,m,arr,dp);
        
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
        for(int i=0;i<n;i++){
            int ans=solve(m-1,i,m,matrix,dp);
            mini=Math.min(mini,ans);
        }
        return mini;
    }
}