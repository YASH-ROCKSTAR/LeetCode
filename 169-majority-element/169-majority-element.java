class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[ans]==nums[i]){
                count=count+1;
            }else{
                count=count-1;
            }
            if(count<0){
                count=0;
                ans=i;
            }
        }
        return nums[ans];
        
    }
}