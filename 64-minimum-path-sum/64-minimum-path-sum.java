class Solution {
    public int sum(int i,int j,int[][] arr,int[][] dp){
        if(i==0 && j==0) return arr[i][j];
        if(i<0 || j<0) return (int)Math.pow(10,9);
        
        if(dp[i][j]!=-1) return dp[i][j];
        int up=arr[i][j]+sum(i-1,j,arr,dp);
        int left=arr[i][j]+sum(i,j-1,arr,dp);
        
        return dp[i][j]=Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return sum(m-1,n-1,grid,dp);
    }
}