class Solution {
    public int rob(int[] nums) {
        return solve(nums,0,new HashMap<Integer,Integer>());
    }
    public int solve(int[] nums,int current,HashMap<Integer,Integer> mp){
        if(current>=nums.length){
            return 0;
        }
        int currentkey=current;
        
        if(mp.containsKey(currentkey)){
            return mp.get(currentkey);
        }
        int rob=nums[current]+solve(nums,current+2,mp);
        int norob=solve(nums,current+1,mp);
        
        mp.put(currentkey,Math.max(rob,norob));
        return mp.get(currentkey);
    }
}