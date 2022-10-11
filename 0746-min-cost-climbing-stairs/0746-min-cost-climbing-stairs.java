class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        return Math.min(solve(cost,0,mp),solve(cost,1,mp));
    }
    public int solve(int[] cost,int current,HashMap<Integer,Integer> mp){
        if(current==cost.length){
            return 0;
        }
        if(current>cost.length){
            return 1001;
        }
        int currentkey=current;
        if(mp.containsKey(currentkey)){
            return mp.get(currentkey);
        }
        int onejump=cost[current]+solve(cost,current+1,mp);
        int twojump=cost[current]+solve(cost,current+2,mp);
       
        mp.put(currentkey,Math.min(onejump,twojump));
        return mp.get(currentkey);
    }
}