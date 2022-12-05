
class Solution {
    public List<Integer> getRow(int numRows) {
        List<Integer> li=new ArrayList<>();
        int[][] dp=new int[numRows+1][numRows+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        for(int i=0;i<=numRows;i++){
            li.add(solve(dp,numRows,numRows,i));
            
        }
        return li;
    }
    public int solve(int[][] dp,int numRows,int i,int j){
        if(i==0 || j==0 || i==j){
            dp[i][j]=1;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        dp[i][j]=solve(dp,numRows,i-1,j-1)+solve(dp,numRows,i-1,j);
        return dp[i][j];

    }
}