class Solution {
    public int change(int amount, int[] coins) {
        return solve(coins,0,amount,new HashMap<String,Integer>());
    }
    public int solve(int[] nums,int current,int amount,HashMap<String,Integer> mp){
        if(amount==0){
            return 1;
        }
        if(current>=nums.length){
            return 0;
        }
        String currentkey=Integer.toString(current)+"-"+Integer.toString(amount);
        if(mp.containsKey(currentkey)){
            return mp.get(currentkey);
        }
        int curcoin=nums[current];
        int take=0;
        if(curcoin<=amount){
            take=solve(nums,current,amount-curcoin,mp);
        }
        int nottake=solve(nums,current+1,amount,mp);
        mp.put(currentkey,take+nottake);
        return mp.get(currentkey);
        
    }
}