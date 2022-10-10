class Solution {
    public int climbStairs(int n) {
        return totalways(0,n,new HashMap<Integer,Integer>());
    }
    public int totalways(int current,int target,HashMap<Integer,Integer> mp){
        if(current==target){
            return 1;
        }
        if(current>target){
            return 0;
        }
        int currentKey=current;
        if(mp.containsKey(currentKey)){
            return mp.get(currentKey);
        }
        int onejump=totalways(current+1,target,mp);
        int twojump=totalways(current+2,target,mp);
        
        mp.put(currentKey,onejump+twojump);
        return onejump+twojump;
    }
}