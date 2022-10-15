class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int[] freq=new int[max+1];
        for(int i:nums){
            freq[i]++;
        }
        return solve(freq,0,new HashMap<Integer,Integer>());
    }
    public int solve(int[] nums,int current,HashMap<Integer,Integer> mp){
        if(current>=nums.length){
            return 0;
        }
        int currentkey=current;
        if(mp.containsKey(currentkey)){
            return mp.get(currentkey);
        }
        int del=nums[current]*current+solve(nums,current+2,mp);
        int notdel=solve(nums,current+1,mp);
        mp.put(currentkey,Math.max(del,notdel));
        return mp.get(currentkey);
    }
}