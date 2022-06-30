class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int sum=0;int mid=nums[nums.length/2];
        for(int i=0;i<nums.length;i++){
            sum+=Math.abs(mid-nums[i]);
        }
        return sum;
    }
}