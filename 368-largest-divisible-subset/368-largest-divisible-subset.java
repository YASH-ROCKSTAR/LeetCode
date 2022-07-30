class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int[] dp=new int[n];
        // Arrays.fill(dp,1);
        int[] hash=new int[n];
        // Arrays.fill(dp,1);
        
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
            hash[i]=i;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && 1+dp[j]>dp[i]){
                    dp[i]=dp[j]+1;
                    hash[i]=j;
                }
            }
        }
        int ans=0;
        int last=-1;
        for(int i=0;i<n;i++){
            if(dp[i]>ans){
                ans=dp[i];
                last=i;
            }
        }
        List<Integer> ans1=new ArrayList<>();
        ans1.add(nums[last]);
        while(hash[last]!=last){
            last=hash[last];
            ans1.add(nums[last]);
            
        }
        return ans1;
        
    }
}