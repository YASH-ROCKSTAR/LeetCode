class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> q=new HashMap<>();
        q.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(q.containsKey(sum-k)){
                count+=q.get(sum-k);
            }
            q.put(sum,q.getOrDefault(sum,0)+1);
        }
        return count;
    }
}