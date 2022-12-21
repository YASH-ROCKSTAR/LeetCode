class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int area=0;
        int[][] dp=new int[m+1][n+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        for(int currow=0;currow<m;currow++){
            for(int curcol=0;curcol<n;curcol++){
                if(matrix[currow][curcol]=='1'){
                    int sidelength=solve(matrix,currow,curcol,m,n,dp);
                    area=Math.max(area,sidelength*sidelength);
                }
            }
        }
        return area;
    }
    public int solve(char[][] matrix,int currow,int curcol,int m,int n,int[][] dp){
        if(currow<0 || currow>=m || curcol<0 || curcol>=n || matrix[currow][curcol]=='0'){
            return 0;
        }
        if(dp[currow][curcol]!=-1){
            return dp[currow][curcol];
        }
        int right=1+solve(matrix,currow,curcol+1,m,n,dp);
        int down=1+solve(matrix,currow+1,curcol,m,n,dp);
        int rightdiag=1+solve(matrix,currow+1,curcol+1,m,n,dp);

        return dp[currow][curcol]=Math.min(right,Math.min(down,rightdiag));
    }
}