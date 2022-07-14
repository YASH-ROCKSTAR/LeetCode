class Solution {
    public int findPeakElement(int[] nums) {
        //binart search
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else{
                if(nums[mid]<nums[mid+1]){
                    start=mid+1;
                }
            }
        }
        return start;
    }
}