class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int maxi=-1;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=i-1;j++){
                if(arr[j]<arr[i]){
                    dp[i]=Math.max(1+dp[j],dp[i]);
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }
        return maxi;
    }
}