class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] ans = new int[10001];    
        for(int i: nums)
            ans[i] += i;
        
        for(int i=2; i<ans.length; i++) {
            ans[i] = Math.max( ans[i] + ans[i-2], ans[i-1]);
        }
        return ans[10000]; 
    }
}