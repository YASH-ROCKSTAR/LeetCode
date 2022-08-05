class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i]-k)){
                count+=mp.get(nums[i]-k);
            }
            if(mp.containsKey(nums[i]+k)){
                count+=mp.get(nums[i]+k);
            }
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        return count;
        
    }
}