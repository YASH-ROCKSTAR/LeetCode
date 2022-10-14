class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,0,target);
    }
    public int solve(int[] nums,int current,int target){
        if(current==nums.length && target==0){
            return 1;
        }
        if(current==nums.length && target!=0){
            return 0;
        }
        int pos=solve(nums,current+1,target-nums[current]);
        int neg=solve(nums,current+1,target+nums[current]);
        
        return pos+neg;
    }
}