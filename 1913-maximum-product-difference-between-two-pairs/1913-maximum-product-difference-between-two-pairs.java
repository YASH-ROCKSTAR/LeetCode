class Solution {
    public int maxProductDifference(int[] nums) {
        int firmax=Integer.MIN_VALUE,secmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firmax){
                secmax=firmax;
                firmax=nums[i];
            }else{
                if(nums[i]>secmax){
                    secmax=nums[i];
                }
            }
        }
        int firmin=Integer.MAX_VALUE,secmin=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<firmin){
                secmin=firmin;
                firmin=nums[i];
            }else{
                if(nums[i]<secmin){
                    secmin=nums[i];
                }
            }
        }
        return secmax*firmax-secmin*firmin;
    }
}