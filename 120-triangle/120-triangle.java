class Solution {
    public int solve(int i,int j,List<List<Integer>> arr,int[][]dp){
        int n=arr.size();
        if(i==n-1){
            return arr.get(i).get(j);
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int down=arr.get(i).get(j)+solve(i+1,j,arr,dp);
        int diag=arr.get(i).get(j)+solve(i+1,j+1,arr,dp);
        
        return dp[i][j]=Math.min(down,diag);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp=new int[n][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,triangle,dp);
    }
}