class Solution {
//     public int solve(int i,int j,int[][] arr,int[][] dp){
        
//         if(i<0 || j<0) return 0;
        
//         if(arr[i][j]==1) return 0;
        
//         if(i==0 && j==0) return 1;
        
//         if(dp[i][i]!=-1){
//             return dp[i][j];
//         }
        
//         int up=solve(i-1,j,arr,dp);
//         int left=solve(i,j-1,arr,dp);
        
//         return dp[i][j]=up+left;
//     }
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
//         int m=obstacleGrid.length;
//         int n=obstacleGrid[0].length;
        
//         int[][] dp=new int[m][n];
        
//         for(int[] row:dp){
//             Arrays.fill(row,-1);
//         }
//         return solve(m-1,n-1,obstacleGrid,dp);
//     }
    private int getAllPath(int row, int col, int grid[][], int dp[][]){
        
        if(row < 0 || col < 0 ) return 0;
        
        if(grid[row][col] == 1) return 0;
        
        if(row == 0 && col == 0) return 1;
        
        if(dp[row][col] != -1) return dp[row][col];
        
        int left = getAllPath(row, col-1, grid, dp);
        int up = getAllPath(row-1, col, grid, dp);
        
        return dp[row][col] = left + up;
        
        
    }
    //import java.util.Arrays;
    public int uniquePathsWithObstacles(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        int dp[][] = new int[m][n];
        for(int arr[] : dp) Arrays.fill(arr, -1);
        
        return getAllPath(m-1, n-1, grid, dp);
        
    }
}