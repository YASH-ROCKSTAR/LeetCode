class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }   
        return solve(nums,0,sum/2,new HashMap<String,Boolean>());
    }
    public boolean solve(int[] nums,int current,int target,HashMap<String,Boolean> mp){
        if(target==0){
            return true;
        }
        if(current>=nums.length){
            return false;
        }
        String currentKey=Integer.toString(current) + "-" + Integer.toString(target);
        if(mp.containsKey(currentKey)){
            return mp.get(currentKey);
        }
        boolean take=false;
        if(nums[current]<=target){
            take=solve(nums,current+1,target-nums[current],mp);
            if(take){
                mp.put(currentKey,true);
                return true;
            }
        }
        boolean not=solve(nums,current+1,target,mp);
        mp.put(currentKey,take || not);
        return take||not;
    }
}