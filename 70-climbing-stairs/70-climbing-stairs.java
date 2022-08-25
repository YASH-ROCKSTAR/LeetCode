class Solution {
    public int climbStairs(int n) {
        //declaring n+1 size dp
        int[] dp=new int[n+1];
        //filling dp array with -1
        Arrays.fill(dp,-1);
        
        return climb(n,dp);
    }
    public int climb(int n,int[] dp){
        //see asume n clmb stair is below the gorund then uif n<0 return 0 beacuse qwill not go there
        if(n<0){
            return 0;
        }
        //if(n==0) means it reahces zero then return 1
        if(n==0){
            return 1;
        }
        //if int some of step value is valuether anf thst postion dp has value other than -1 then it return dp
        if(dp[n]!=-1){
            return dp[n];
        }
        //returning dp by using recursive relation
        return dp[n]=climb(n-1,dp)+climb(n-2,dp);
    }
}