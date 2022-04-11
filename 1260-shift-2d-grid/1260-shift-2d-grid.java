class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length;
        int[][] temp=grid;
        
        while(k-- >0){
            
            temp=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=1;j<n;j++){
                    temp[i][j]=grid[i][j-1];
                }
            }
            for(int i=1;i<m;i++){
                temp[i][0]=grid[i-1][n-1];
            }
            temp[0][0]=grid[m-1][n-1];
            
            grid=temp;
        }
        return (List)Arrays.asList(temp);
    }
}