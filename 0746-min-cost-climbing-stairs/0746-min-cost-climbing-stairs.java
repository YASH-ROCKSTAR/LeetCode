class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        //so here we have solve problrm for 0 index in that we also calculated for 1 also so we can get answer from there
        return Math.min(solve(cost,0,mp),mp.get(1));
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