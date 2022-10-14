class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,0,target,new HashMap<String,Integer>());
    }
    public int solve(int[] nums,int current,int target,HashMap<String,Integer> mp){
        if(current==nums.length && target==0){
            return 1;
        }
        if(current==nums.length && target!=0){
            return 0;
        }
        String currentkey=Integer.toString(current) + "-" +Integer.toString(target);
        if(mp.containsKey(currentkey)){
            return mp.get(currentkey);
        }
        int pos=solve(nums,current+1,target-nums[current],mp);
        int neg=solve(nums,current+1,target+nums[current],mp);
        mp.put(currentkey,pos+neg);
        return mp.get(currentkey);
    }
}