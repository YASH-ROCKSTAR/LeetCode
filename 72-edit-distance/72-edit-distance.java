class Solution {
    public int solve(String st,String tt,int i,int j,int[][] dp){
        if(i<0) 
            return j+1;
        if(j<0) 
            return i+1;
        
        if(dp[i][j]!=-1) return dp[i][j] ;
        if(st.charAt(i)==tt.charAt(j))
            return dp[i][j]=0+solve(st,tt,i-1,j-1,dp);
        
        //delete ,insert and replace operation
        else return dp[i][j] = 1+Math.min(solve(st,tt,i-1,j-1,dp),
        Math.min(solve(st,tt,i-1,j,dp),solve(st,tt,i,j-1,dp)));
    }
//     int solve(String S1, String S2, int i, int j, int[][] dp){
    
//         if(i<0)
//             return j+1;
//         if(j<0)
//             return i+1;

//         if(dp[i][j]!=-1) return dp[i][j];

//         if(S1.charAt(i)==S2.charAt(j))
//             return dp[i][j] =  0+solve(S1,S2,i-1,j-1,dp);

//         // Minimum of three choices
//         else return dp[i][j] = 1+Math.min(solve(S1,S2,i-1,j-1,dp),
//         Math.min(solve(S1,S2,i-1,j,dp),solve(S1,S2,i,j-1,dp)));
    
//     }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(word1,word2,m-1,n-1,dp);
    }
}