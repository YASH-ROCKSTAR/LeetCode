class Solution {
    public int climbStairs(int n) {
        return solve(n,0,new HashMap<Integer,Integer>());
    }
    public int solve(int n,int current,HashMap<Integer,Integer> mp){
        if(current==n){
            return 1;
        }
        if(current>n){
            return 0;
        }
        int currentkey=current;
        if(mp.containsKey(currentkey)){
            return mp.get(currentkey);
        }
        int onejump=solve(n,current+1,mp);
        int twojump=solve(n,current+2,mp);
        mp.put(currentkey,onejump+twojump);
        return onejump+twojump;
    }
}