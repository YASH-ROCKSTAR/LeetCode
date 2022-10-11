class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        HashMap<Integer,Integer> mp2=new HashMap<>();
        //max(rob,norob);
        return Math.max(solve(nums,0,nums.length-1,mp),solve(nums,1,nums.length,mp2));
    }
    public int solve(int[] nums,int current,int n,HashMap<Integer,Integer> mp){
        if(current>=n){
            return 0;
        }
        int currentkey=current;
        if(mp.containsKey(currentkey)){
            return mp.get(currentkey);
        }
        int rob=nums[current]+solve(nums,current+2,n,mp);
        int norob=solve(nums,current+1,n,mp);
        
        mp.put(currentkey,Math.max(rob,norob));
        return Math.max(rob,norob);
    }
}