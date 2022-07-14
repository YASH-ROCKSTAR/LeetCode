class Solution {
    public int solve(int start,int end,int[] nums,int target){
        start=0;
        end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        
        return solve(0,nums.length-1,nums,target);
        
    }
}