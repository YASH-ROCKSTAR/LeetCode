class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
        int score=0;
        int j=0;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length;){
            if(set.contains(nums[i])){
                sum-=nums[j];
                set.remove(nums[j++]);
                continue;
            }
            sum+=nums[i];
            score=Math.max(score,sum);
            set.add(nums[i++]);
        }
        return score;
    }
}