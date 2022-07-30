class Solution {
    public int maxProductDifference(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                max=Math.max(max,nums[i]*nums[j]);
                min=Math.min(min,nums[i]*nums[j]);
            }
        }
        return max-min;
    }
}