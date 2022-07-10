class Solution {
    public int solve(int i,int j1,int j2,int r,int c,int[][] arr,int[][][] dp){
        if(j1<0 || j1>=c || j2<0 || j2>=c){
            return (int)Math.pow(-10,9);
        }
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        if(i==r-1){
            if(j1==j2){
                return arr[i][j1];
            }else{
                return arr[i][j1]+arr[i][j2];
            }
        }
        int maxi=(int)Math.pow(-10,9);
        for(int dj1=-1;dj1<=+1;dj1++){
            for(int dj2=-1;dj2<=+1;dj2++){
                int value=0;
                if(j1==j2){
                    value=arr[i][j1];
                }else{
                    value=arr[i][j1]+arr[i][j2];
                }
                value+=solve(i+1,j1+dj1,j2+dj2,r,c,arr,dp);
                maxi=Math.max(maxi,value);
            }
        }
        return dp[i][j1][j2]=maxi;
    }
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][][] dp=new int[m][n][n];
        for(int[][] row1:dp){
            for(int[] row2:row1){
                 Arrays.fill(row2,-1);     
            }
           
        }
        return solve(0,0,n-1,m,n,grid,dp);
    }
}