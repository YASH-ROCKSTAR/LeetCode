class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int[] prev=new int[m];
        for(int i=0;i<m;i++){
            int[] temp=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    temp[j]=grid[i][j];
                }
                else{
                    int up=grid[i][j];
                    if(i>0){
                        up+=prev[j];
                    }else{
                        up+=(int)Math.pow(10,9);
                    }
                    int left=grid[i][j];
                    if(j>0){
                        left+=temp[j-1];
                    }else{
                        left+=(int)Math.pow(10,9);
                    }
                    temp[j]=Math.min(up,left);
                }
            }
            prev=temp;
        }
        return prev[n-1];
    }
}