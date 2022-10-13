class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        return Math.min(solve(cost,0,mp),mp.get(1));   
    }
    public int solve(int[] cost,int current,HashMap<Integer,Integer> mp){
        if(current==cost.length){
            return 0;
        }
        if(current>cost.length){
            return 1001;
        }
        int curr=current;
        if(mp.containsKey(curr)){
            return mp.get(curr);
        }
        int one=cost[current]+solve(cost,current+1,mp);
        int two=cost[current]+solve(cost,current+2,mp);
        mp.put(curr,Math.min(one,two));
        return mp.get(curr);
    }
}