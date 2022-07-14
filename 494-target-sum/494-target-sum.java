class Solution {
    public static int fun(int ind,int sum,int[] arr,int[][] dp){
        
        if(ind==0){
            if(sum==0 && arr[0]==0){
                return 2;
            }
            if(sum==0 || arr[0]==sum){
                return 1;
            }
            return 0;
        }
        if(dp[ind][sum]!=-1){
            return dp[ind][sum];
        }
        int nottake=fun(ind-1,sum,arr,dp);
        int take=0;
        
        if(arr[ind]<=sum) take=fun(ind-1,sum-arr[ind],arr,dp);
        
        return dp[ind][sum]=(take+nottake);
    }
    public static int findWays(int num[], int tar) {
        // Write your code here..
        int n=num.length;
        int[][] dp=new int[n][tar+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return fun(n-1,tar,num,dp);
    }
	public static int countPartitions(int n, int d, int[] arr) {
		// Write your code here.
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];    
        }
        if(sum-d<0 || (sum-d)%2==1) return 0;
        
        return findWays(arr,(sum-d)/2);
	}
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        return countPartitions(n,target,nums);
    }
}