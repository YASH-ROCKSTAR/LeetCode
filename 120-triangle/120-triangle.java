class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(triangle.size()-1).size();
        int dp[][] = new int[m][n];
        
        for(int i = m-1;i>=0;i--){
            for(int j = 0;j<triangle.get(i).size();j++){
                if(i == m-1){
                    dp[i][j] = triangle.get(i).get(j);
                }else{
                    dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i+1][j],dp[i+1][j+1]);
                }
            }
        }
             
        return dp[0][0];
    }
   
}