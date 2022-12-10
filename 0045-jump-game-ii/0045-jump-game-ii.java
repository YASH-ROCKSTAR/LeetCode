class Solution {
    public int jump(int[] nums) {
        return solve(nums,0,new HashMap<Integer,Integer>());
    }
    public int solve(int[] nums,int current,HashMap<Integer,Integer> mp){
        if(current>=nums.length-1){
            return 0;
        }
        if(nums[current]==0){
            return 10001;
        }
        int currentkey=current;
        if(mp.containsKey(currentkey)){
            return mp.get(currentkey);
        }
        int currentindex=nums[current];
        int ans=10001;
        for(int i=1;i<=currentindex;i++){
            int temp=1+solve(nums,current+i,mp);
            ans=Math.min(ans,temp);
        }
        mp.put(currentkey,ans);
        return ans;
    }
}